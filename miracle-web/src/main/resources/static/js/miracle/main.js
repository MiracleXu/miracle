new Vue({
    el: '#app',
    data: {
        dialogVisible: false,
        result:""
    },
    mounted:function() {
        this.init();
    },
    methods: {
        init:function(){
            var self = this;
            this.$http.get('http://localhost:8081/test').then(response => {
                console.log(response.data);
                self.result = response.data.result;
                console.log(self.result);
            }, response => {
                console.log("error");
            });
        },
        handleClose:function(done) {
            this.$confirm('确认关闭？')
                .then(_ => {
                    done();
                })
                .catch(_ => {});
        }
    }
})