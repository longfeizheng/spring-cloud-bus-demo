- /{name}-{profiles}.yml
- /{label}/{name}-{profiles}.yml

---
- name:服务名
- profiles:环境
- label:分支


自动刷新路径:curl -v -X POST "http://localhost:9091/actuator/bus-refresh"

集成webhook实现自动更新：https://natapp.cn
