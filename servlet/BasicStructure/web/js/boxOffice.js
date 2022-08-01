

function getData(){
    // 서버 프로그램을 호출해서 결과를 받아와 화면처리를 한다
    // 비동기 방식으로 처리한다
    // AJAX 를 사용해서 처리한다
    let today = $('#searchDate').val();
    today = today.replace(/-/g,'');
    $.ajax({
      //ajax 를 호출하기 위해서 객체에 정해져있는 키값이 들어간다
      async: true,           //동기화할것인지 비동기할 것인지 선택 (true- 비동기: 멈추지않고 자동으로 넘어간다 )
      url: 'http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json',
      type: 'GET',
      data: {
        key: '527a4b55fbf4fd9f7fbb22dff459b59d',
        targetDt: today
      },
      timeout: 3000, //서버가 바쁘면 대기해야한다. 기다리는 시간을 명시한다 시간내에 결과 안오면 실패로 간주
      dataType: 'json', //결과 데이터가 json 일때 json 문자열을 자바스크립트 객체로 변환한다.
      success: function (result){
        //success 뒤에 익명함수
        //만약 서버 호출에 성공하면 이 함수가 호출된다
        alert('서버호출 성공!!');
        console.log(result);
        movieName = result['boxOfficeResult']['dailyBoxOfficeList'][0]['movieNm'];
        //얻어온 값을 이용해서 tag 를 만들어야 한다 그리고 DOM 을 붙여야 한다
        let tr = $("<tr></tr>");   // <tr></tr>
        // <td>1</td>
        let orderTd = $("<td></td>").text(result['boxOfficeResult']['dailyBoxOfficeList'][0]['rank']);
        tr.append(orderTd);
        let posterTd = $("<td></td>");
        tr.append(posterTd);
        let titleTd = $("<td></td>").text(result['boxOfficeResult']['dailyBoxOfficeList'][0]['movieNm']);
        tr.append(titleTd);
        let actorTd = $("<td></td>");
        tr.append(actorTd);
        let deleteTd = $("<td></td>");
        tr.append(deleteTd);

        $('tbody').empty();
        $('tbody').append(tr);
      },
      error:function (){
        //실패일 경우
        alert('에러났어!!!');
      }
    });

}