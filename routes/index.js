var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});


/* GET login page. */
router.get('/login', function(req, res, next) {
  res.render('login', { title: 'Express' });
});


/* GET teste page. */
router.get('/profile', function(req, res, next) {
  res.render('profile', { title: 'Express' });
});

/* GET teste page. */
router.get('/teste', function(req, res, next) {
  res.render('TesteIndex', { title: 'Express' });
});

router.post('/', function(req, res, next) {
  // Lógica para lidar com a solicitação POST
  res.json({ status: 'success', message: 'Dados recebidos com sucesso' });
});


module.exports = router;
