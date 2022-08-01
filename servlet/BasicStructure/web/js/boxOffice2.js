
function getData() {
  // 서버프로그램을 호출해서 결과를 받아와서 화면처리해요!
  // 비동기방식으로 처리
  // AJAX를 이용해서 처리해 보아요!
  let today = $('#searchDate').val();  // 2022-07-30
  today = today.replace(/-/g, '');     // 20220730

  $.ajax({
    async: true,   // AJAX의 기본 동작방식(비동기방식)
    url: 'http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json',
    type: 'GET',
    data : {
      key: '6d6c704bf1644a65a891bd41b69afe8f',
      targetDt: today   // 2022-07-30 => '-' 제거
    },
    timeout: 3000,  // 1000분의 1초 단위. 이 시간내에 서버로 부터  결과가 안오면 실패로 간주.
    dataType: 'json',
    success: function(result) {
      // 만약 서버 호출이 성공하면 이 함수가 호출
      // result는 서버가 전달해 준 JSON에 대한 JavaScript 객체
      $('tbody').empty();

      let movieList = result['boxOfficeResult']['dailyBoxOfficeList'];
      for(let i=0; i<movieList.length; i++) {
        let tr = $("<tr></tr>");
        let orderTd = $("<td></td>").text(movieList[i]['rank']);
        tr.append(orderTd);
        //////////////////////////////////////////////////////
        let posterTd = $("<td></td>");
        let posterImg = $("<img />")
        $.ajax({
          url: 'https://dapi.kakao.com/v2/search/image',
          type: 'get',
          data: {
            query: movieList[i]['movieNm']  //영화제목
          },
          headers: {
            Authorization: 'KakaoAK c40fcd0a1d974ab680f9d89dcdca3a65' //rest API 키
          },
          dataType: 'json',
          success: function(imgResult) {
            posterImg.attr('src', imgResult.documents[0].thumbnail_url); //
          },
          error: function() {
            alert('이미지 검색 실패');
          }
        });
        posterTd.append(posterImg);
        tr.append(posterTd);
        let titleTd = $("<td></td>").text(movieList[i]['movieInfo']['peopleNm']);
        tr.append(titleTd);
        //////////////////////////////////////////////////////
        let actorTd = $("<td></td>").text(actorList['peopleNm']);
        tr.append(actorTd);
        $.ajax({
          url: 'http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.json',
          type: 'get',
          data: {
            key: '6d6c704bf1644a65a891bd41b69afe8f',
            movieCd: movieList[i]['movieCd']
          },
          timeout: 3000,
          dataType: 'json',
          success: function(actorResult) {
            let actorList = actorResult['movieInfoResult']['movieInfo'];
          },
          error: function() {
            alert('주연배우 검색 실패');
          }
        });
        let deleteTd = $("<td></td>");
        tr.append(deleteTd);

        $('tbody').append(tr);
      }
    },
    error: function() {
      // 만약 서버 호출이 실패하면 이 함수가 호출
      alert('오류발생!!!');
    }
  });






}