var express = require('express');
var router = express.Router();
var httpClient = require('axios');

/* GET users listing. */
router.post('/', function(req, res, next) {
  let id = req.query.id;
  httpClient.get("http://localhost:8080/api/v1/ping?id="+id)
            .then((response)=>{
              res.send('respond with a resource');
            })
  
});

module.exports = router;
