package ifttt

/*
消息流转
*/
type IFTTTService interface {
	CreateParser()
	UpdateParser()
	ListParser()
	GetParser()
	DeleteParser()
	CreateParserDataSource()
	UpdateParserDataSource()
	ListParserDataSource()
	GetParserDataSource()
	DeleteParserDataSource()
	CreateDataSourceItem()
	ListDataSourceItem()
	DeleteDataSourceItem()
	CreateDestination()
	UpdateDestination()
	ListDestination()
	GetDestination()
	DeleteDestination()
	AttachParserDataSource()
	DetachParserDataSource()
	AttachDestination()
	DetachDestination()
	SaveScript()
	PublishScript()
	StartParser()
	StopParser()
}

/*
服务端订阅
*/
type ServiceSubscribe interface {
	CreateSubscribeRelation()
	UpdateSubscribeRelation()
	QuerySubscribeRelation()
	DeleteSubscribeRelation()
	CreateConsumerGroup()
	UpdateConsumerGroup()
	QueryConsumerGroupByGroupId()
	QueryConsumerGroupList()
	queryConsumerGroupStatus()
	ResetConsumerGroupPosition()
	DeleteConsumerGroup()
	CreateConsumerGroupSubscribeRelation()
	DeleteConsumerGroupSubscribeRelation()
}
