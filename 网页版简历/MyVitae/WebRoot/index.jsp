<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>我的简历</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	img{
	border:thin solid  #FF33FF ;
	position:absolute;
	left:1208px;
	top:83px;
	}
	font{
	color: #FF33FF;
	}
	ul{
	list-style-image:url(image/li.png);
	line-height:20px;
	}
	#mainDiv{
	border:thin solid  #FF33FF ;
	width:690px;
	height:910px;
	text-align:left;
	margin-left:600px;
	font-size:14px;
	background-color:white;
	}
	#border{
	border:thin solid  #FF33FF ;
	width:670px;
	margin:-1px;
    padding-left:20px;
    line-height:22px;
	}
	#head{
	border:thin solid  #FF33FF ;
	width:285px;
	height:113px;
	margin:-1px;
	padding-left:15px;
	padding-top:15px;
	line-height:22px;
	}
	#head2{
	border:thin solid  #FF33FF ;
	width:283px;
	height:121px;
	margin-left:300px;
	padding-left:15px;
	padding-top:7px;
	position:absolute;
	left:609px;
	top:83px;
	line-height:25px;
	}
	#ex{
	border:thin solid  #FF33FF ;
	width:690px;
	margin:-1px;
    line-height:22px;
	}
	#th{
	border:thin solid  #FF33FF ;
	background-color:#FFCCFF;
	padding-top:8px;
	padding-left:6px;
	color:blue;
	margin:-1px;
	width:684px;
	height:18px;
	}
	#contact{
	border:thin solid  #FF33FF ;
	width:210px;
	height:22px;
	margin:-1px;
	padding-left:15px;
    padding-top:10px;
	}
	#contact2{
	border:thin solid  #FF33FF ;
	width:210px;
	height:22px;
	margin:-1px;
	padding-left:15px;
    padding-top:10px;
	position:absolute;
	left:835px;
	top:240px;
	}
	#contact3{
	border:thin solid  #FF33FF ;
	width:223px;
	height:22px;
	margin:-1px;
	padding-left:15px;
    padding-top:10px;
	position:absolute;
	left:1061px;
	top:240px;
	}
	.operate{
	padding-left:45px;
	text-align:left;
	}
	.cut{
	text-indent:30px;
	}
	</style>
  </head>
  
  <body background="image/20130209125000177.jpg">
  
    <h2 align="center">应聘职位：前端开发工程师</h2>
      <div id="mainDiv"> 
          <div id="th">
                                         个人概况
         </div>
               <div id="head">
                                                                                  姓名：<font size="6px;">脱咪</font><br/>
                                                                                  性别：女<br/>
                                                                                  籍贯：陕西宝鸡<br/>
                                                                                  民族：汉<br/>
                                                                                  政治面貌：团员             
             </div>
              <div id="head2">
                                                                                 所在学校：西安邮电大学<br/>
                                                                                 所学专业：信息对抗技术<br/>
                                                                                 学    历：本科<br/>
                                                                                 毕业时间：2016年7月<br/>
                                                                                 专业排名：前十内            
             </div>  
             <img src="image/2015-08-06_141022.png">     
          <div id="th"> 
                                         联系方式</div>
               <div id="contact">
                                                                 手机：13630251242<br/>                                              
              </div>
               <div id="contact2">
                                                                邮箱：tuomichn@foxmail.com<br/>                                              
              </div>
               <div id="contact3">
                  GitHub:  tuomimi<br/>                                              
              </div>
          <div id="th">
                                       计算机水平
         </div>
               <div id="border">
                                                            掌握MATLAB的基础操作以及Word、Excel等办公软件；<br/>
                                                            了解数据库方面知识及会简单的SQL语言编写；<br/>
                                                            会使用HTML、CSS、JavaScript进行简单的网页制作；<br/>
                                                            会简单的C语言、HTML语言、VHDL语言、Java语言编程。<br/>
              </div>
          <div id="th">
                                       主要课程
         </div>
               <div id="border">
                 <div class="cut">
                                                                 网络攻防技术、计算机病毒检测技术、安全数据库、通信对抗原理、网络安全基础、信息安全算法设计、嵌入式系统及安全、通信原理、C语言程序设计等.
                </div>
              </div>
          <div id="th">
                                       实践经历
         </div>
               <div id="ex">
                    <strong>校内：</strong>2013-2014学年  任通信与信息工程学院分团委办公室部长一职（<font>组织日常工作，“我是学霸”比赛</font>）<br/>
                    <div class="operate">
                    2014年5月    参加第九届大学生数学建模大赛（<font>负责MATLAB仿真的实现部分）</font><br/>
                    </div>
                    <div class="operate">
                    2014年5月    参加西安邮电大学第48期党校学习并毕业<br/>
                    </div>
                    <div class="operate">
                    2012年到2015年  担任班级生活委员一职（<font>管理班费，组织班级聚餐</font>）<br/>
                    </div>
                    <strong>校外：</strong>2015年7月  在西安途晟网络科技有限公司实习（<font>收获：学习java、HTML、CSS、JavaScript并实践</font>）<br/>
                    <div class="operate">
                    2014年3月  为华丰公司做新品宣传促销活动（<font>收获：1.观察力：发现潜在客户；2.态度：主动热情；3.优势：突出介绍本产品与其他同类产品的不同以及购买价值。</font>）<br/>
                    </div>
                    <div class="operate">
                    2013年3月 跟随活动公司为雅居乐地产布置周年庆活动现场(<font>收获：团队合作及任务分配的重要性</font>）<br/>
                    </div>
                    <div class="operate">
                    2013年1月  为康师傅方便面做产品促销活动（<font>收获：学习到了与客户进行沟通的技巧，如：表达善意，并且态度要主动热情</font>）<br/>
                    </div>
              </div>
          <div id="th">
                                       所获荣誉
         </div>
               <div id="border">
               2013-2014学年  荣获“优秀团员”证书； <br/>
               2012-2013学年  荣获“暑假社会实践先进个人”证书；<br/>
               2012-2013学年  荣获“优秀学生干部”证书 ； <br/>
               2012-2013学年  荣获“三等奖学金”证书；<br/>
              </div>
          <div id="th">
                                       自我评价
         </div>
               <ul>
               <li>细心、有责任心、计划性强且执行能力高</li>
               <li>擅长学习，并善于总结和思考</li>
               <li>喜欢互联网，对网页布局非常感兴趣</li>
               <li>完美主义者，享受视觉体验</li>
               <li>身心健康，容易相处</li>
               </ul>
      </div>
  </body>
</html>
