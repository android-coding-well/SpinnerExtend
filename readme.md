# GitHub上readme模板



---
![image](https://github.com/huweijian5/SegmentBarDemo/blob/master/screenshots/device-2016-09-28-230043.png)

---
## 介绍说明
---
## 使用说明


---
## JavaDoc文档

* [在线JavaDoc](https://jitpack.io/com/github/huweijian5/SpinnerExtend/1.0.0/javadoc/index.html)
* 网址：`https://jitpack.io/com/github/huweijian5/SpinnerExtend/[VersionCode]/javadoc/index.html`
* 其中[VersionCode](https://github.com/huweijian5/SpinnerExtend/releases)请替换为最新版本号
* 注意文档使用UTF-8编码，如遇乱码，请在浏览器选择UTF-8编码即可

---
## 引用

* 如果需要引用此库,做法如下：
* Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```	
* and then,add the dependecy:
```
dependencies {
	        compile 'com.github.huweijian5:SpinnerExtend:latest_version'
}
```
* 其中latest_version请到[releases](https://github.com/huweijian5/SpinnerExtend/releases)中查看并替换

## 注意
* 为了避免引入第三方库导致工程依赖多个版本的问题，如android support库
* 故建议在个人的工程目录下的build.gradle下加入以下变量，具体请看此[build.gradle](https://github.com/huweijian5/SpinnerExtend/blob/master/build.gradle)
```
ext{
       minSdkVersion = 19
       targetSdkVersion = 26
       compileSdkVersion = 26
       buildToolsVersion = '26.0.2'
   
       // App dependencies
       supportLibraryVersion = '26.1.0'
       junitVersion = '4.12'
       runnerVersion = '1.0.1'
       espressoVersion = '2.2.2'
       constraintVersion = '1.0.2'
}

```	
* 请注意，对于此库已有的变量，命名请保持一致