
import React , {Component} from "react"; //리엑트 라이브러리 불러오기
import "./App.css";

// 3. 외부에서 사용가능하도록 노출시켜야함 export default
// 1. class형 component를 이용한다 + Component 상속
export default class App extends Component{

  constructor(props){
    super(props);
    this.state = {  
      // map을 사용하기 위해서 배열을 사용, 객체를 생성했다 [출력 할 데이터]
    todoData : [
        {
          id : "1",
          title : "운동하기",
          completed: false
        },
        {
          id : "2",
          title : "공부하기",
          completed: false
        },
        {
          id : "3",
          title : "잠자기",
          completed: false
        },
      ],
      value: ""
    }
  }

  btnStyle = {
    color: "red",
    border: "none",
    padding: "5px 9px",
    borderRadius: "50%",
    cursor: "pointer",
    float: "right"

  }

getStyle = ()=> {
  return{
    padding: "20px",
    borderBottom: "3px #ccc dotted",
    textDecoration: "none"
  }
}

deleteClick = (id) =>{
  const newTodoData = this.state.todoData.filter(data => data.id !== id)
  console.log(newTodoData);
  // 할일 목록을 지워야 한다 
  // 데이터를 지운다 
  // React에서 데이터가 변할 때 화면을 다시 rendering해 주기 위해서 사용
  // 일반적으로 생성자 안에서 정의 한다
  this.setState({todoData: newTodoData})
}

handleChange = (e)=> {
 // console.log(e.target.value);
 this.setState({value: e.target.value});

}



// 2. 클래스 안에 메소드 생성
  render(){
    return (
      <div className="container">
        <div className="todoBlock">
          <div>
            <h1> Today's TODO : 오늘의 할 일</h1>
          </div>

          {this.state.todoData.map(data => ( //jxs 하나의 값으로 간주

            <div style={this.getStyle()} key={data.id}>                       
            <input type="checkbox" defaultChecked={false} />
            {data.title} 
            <button style={this.btnStyle}
            onClick={()=> this.deleteClick(data.id)}>delete</button>
          </div>
         
         ))}

        <form style={{ display: 'flex'}}>
          <input type='text'
                 name="todoInput"
                 style={{ flex: '10', padding: '5px'}}
                 placeholder="새로운 할일을 입력하세요!" 
                 value={this.state.value}
                 onChange= {this.handleChange} />
           <input type="submit"
                  value="할일 입력"
                  className='btn'
                  style={{flex: '1'}} />     
        </form>
        </div>
      </div>
    )
  }




App;




}

