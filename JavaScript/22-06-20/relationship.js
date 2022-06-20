


var relationship1 = {
    name: "haha",
    friends: ["zazaa", "sasa", "nana"],
    logFriends: function(){
        var that = this;
        this.friends.forEach(function(friend){
            console.log(that.name, friend);

        });
     },
};

relationship1.logFriends();


const relationship2 = {
    name: "eaea",
    friends: ["zazaa", "sasa", "nana"],
    logFriends(){
        this.friends.forEach(friend=>{
            console.log(this.name, friend);
        });
    },
}

relationship2.logFriends();