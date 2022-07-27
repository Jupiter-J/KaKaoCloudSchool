
function search() {
	let keyword = $("#searchKeyword").val();
	let requestURL = "http://localhost:8080/bsearch" + "?keyword=" + keyword;
	window.location.href = requestURL;
}