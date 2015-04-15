##spring roo i18n 中文插件##

原始地址：
    https://code.google.com/p/spring-roo-addon-i18n-chinese/
因为google code被墙导致无法访问，copy到github。

**如果有侵犯版权问题，请联系 starhmx@yeah.com 删除**

--------------------------

##使用说明##
1. 下载源代码
2. 执行mvn install 命令
3. 在roo环境中，执行osgi安装命令

    > osgi start --url file:///D:/software/apache-maven-3.3.1/.m2/repository/com/ccb/roo/addon/i18/com.ccb.roo.addon.i18/0.1.1.BUILD-SNAPSHOT/com.ccb.roo.addon.i18-0.1.1.BUILD-SNAPSHOT.jar
    > //D:/software/apache-maven-3.3.1/.m2/repository(mvn本地仓库地址)

4. 在roo环境中,执行web mvc language --code zh
