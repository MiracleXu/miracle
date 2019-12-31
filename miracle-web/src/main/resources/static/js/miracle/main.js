new Vue({
    el: '#app',
    data: {
        dialogVisible: false,
        result:"",
        tableData:[{
            id:""
        }],
        activeNames: ['1']
    },
    mounted:function() {
        this.init();
    },
    methods: {
        init:function(){
            var self = this;
            this.$http.get('http://www.xuting.xyz/test').then(response => {
                console.log(response.data);
                self.result = response.data.result;
                self.tableData = response.data.firstDao;
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