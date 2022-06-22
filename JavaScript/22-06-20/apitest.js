

<script scr="https:/unpkg.com/axios/dist/axios.min.js"></script>
axios.get('https://www.zerocho.com/api/get')
.then((result)=>{
    console.log(result);
    console.log(result.data);
})
.catch((error)=> {
    console.error(error);
})

(async()=>{
    try{
        const result = await axios.get('https://www.zerocho.com/api/get');
        console.log(result);
        console.log(result.data);
    }catch(error){
        
    }
})();