package broker

/*
需要保存qos等级大于1的上下行消息。
需要保存两份索引
1. 基于messageId
2. 基于reqId

飞行窗口设计
*/
