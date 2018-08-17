new Vue({
    el: '#app',
    data: {
        dialogVisible: false
    },
    mounted:function() {

    },
    methods: {
        handleClose(done) {
            this.$confirm('确认关闭？')
                .then(_ => {
                    done();
                })
                .catch(_ => {});
        }
    }
})