<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado Final</title>
</head>
<body>

  <div class="row">
    <div class="col-md-4 col-md-offset-4">
      <form class="form-horizontal" role="form">
        <fieldset>

          <!-- Form Name -->
          <legend>SISTEMA ACADÊMICO UFG</legend>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput"> Nome: </label>
            <div class="col-sm-10">
              <input type="text" placeholder="Insira seu nome aqui" class="form-control">
              <input type="text" name = "nome"><br>
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Frequência:</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Insira frequencia" class="form-control" name="frequencia">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <label class="col-sm-2 control-label" for="textinput">Nota Final:</label>
            <div class="col-sm-10">
              <input type="text" placeholder="Insira a Nota" class="form-control" name="notaFinal">
            </div>

          <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
              <div class="pull-right">
                <button type="submit" class="btn btn-primary">Resultado:</button>
              </div>
            </div>
          </div>

        </fieldset>
      </form>
    </div><!-- /.col-lg-12 -->
     <b>${resultadoFinal}</b>
</body>
</html>

