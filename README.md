# spring-saving-the-world

Co trzeba ustawić w pliku context dla tomcata po dodaniu hikari i mssql 

<Context>

    <WatchedResource>WEB-INF/web.xml</WatchedResource>
    <WatchedResource>WEB-INF/tomcat-web.xml</WatchedResource>
    <WatchedResource>${catalina.base}/conf/web.xml</WatchedResource>

    <Resource name="jdbc/polaczenie" auth="Container"
                factory="com.zaxxer.hikari.HikariJNDIFactory"
                type="javax.sql.DataSource"
                jdbcUrl="jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=mamaleka;user=mamaleka;password=Magdamalek1!">

    </Resource>
