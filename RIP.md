## 动态RIP实验报告
1. 实验拓扑
![alt text](image.png)
2. 实验结果
* 根据拓扑图配置端口ip并启动端口后，路由器A上尝试ping 192.168.1.2 198.168.2.1 192.168.2.2 不能成功联通
* 配置RIP协议动态路由后可联通，在路由器A上show ip route 和ping 192.168.2.1的结果如图所示![alt text](9fd6ac3af728fb842e7f032642408cc.jpg)   
3. 实验命令
* 配置并启动端口
``` 
RouterA(config)#int s0/1/0
RouterA(config-if)#ip address 192.168.1.1 255.255.255.0
RouterA(config-if)#no shut
```
```
RouterB(config)#int s0/1/0
RouterB(config-if)#ip address 192.168.1.0 255.255.255.0
RouterB(config-if)#no shut
RouterB(config)#int s0/1/1
RouterB(config-if)#ip address 192.168.2.1 255.255.255.0
RouterB(config-if)#no shut
```
```
RouterC(config)#int s0/1/0
RouterC(config-if)#ip address 192.168.1.1 255.255.255.0
RouterC(config-if)#no shut
```
* 配置RIP协议动态路由
```
RouterA(config)#router rip
RouterA(config-router)#network 192.168.1.0
```
```
RouterB(config)#router rip
RouterB(config-router)#network 192.168.1.0
RouterB(config-router)#network 192.168.2.0
```
```
Routerc(config)#router rip
RouterC(config-router)#network 192.168.2.0
```
* 其他

![alt text](image-1.png)
