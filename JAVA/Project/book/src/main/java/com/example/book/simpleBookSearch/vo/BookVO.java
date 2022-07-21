package com.example.book.simpleBookSearch.vo;

public class BookVO {

    //데이터베이스 테이블을 기준으로 만들어야 한다
    //컬럼을 가지고 만들어야 함 - 원래는 다 넣어줘야 한다
    private String bisbn;
    private String btitle;
    private String bdate;
    private String bpage;
    private String bprice;
    private String bauthor;

    //default 생성자는 꼭 만들어주기
    public BookVO(){

    }

    public String getBisbn() {
        return bisbn;
    }

    public void setBisbn(String bisbn) {
        this.bisbn = bisbn;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getBpage() {
        return bpage;
    }

    public void setBpage(String bpage) {
        this.bpage = bpage;
    }

    public String getBprice() {
        return bprice;
    }

    public void setBprice(String bprice) {
        this.bprice = bprice;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
}
