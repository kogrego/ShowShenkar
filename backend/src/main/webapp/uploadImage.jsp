<%@ page import="com.google.appengine.api.blobstore.BlobstoreServiceFactory" %>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService" %>

<%
    BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
%>


<html>
    <head>
        <title>Upload ShowShenkar</title>
    </head>
    <body>
        <form action="<%= blobstoreService.createUploadUrl("/upload") %>" method="post" enctype="multipart/form-data">
            <label>type<input type="text" name="type"></label><br>
            <label>name<input type="text" name="name"></label><br>
            <label>url<input type="text" name="url"></label><br>
            <label>infoText<input type="text" name="infoText"></label><br>
            <label>department<input type="text" name="department"></label><br>
            <label>studentNames<input type="text" name="studentNames"></label><label>(comma seperated)</label><br>
            <label>studentEMails<input type="text" name="studentEMails"></label><label>(comma seperated)</label><br>
            <label>projectIds<input type="text" name="projectIds"></label><label>(comma seperated)</label><br>
            <label>contentIds<input type="text" name="contentIds"></label><label>(comma seperated)</label><br>
            <label>description<input type="text" name="description"></label><br>
            <label>lat<input type="text" name="lat"></label><br>
            <label>lng<input type="text" name="lng"></label><br>
            <label>attach file<input type="file" name="myFile"></label><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>