package tmp

/*
产品管理接口
*/
type ProductAdminService interface {
	CreateProduct()
	UpdateProduct()
	QueryProductList()
	QueryProduct()
	DeleteProduct()
	CreateProductTags()
	UpdateProductTags()
	DeleteProductTags()
	ListProductTags()
	ListProductByTags()
	UpdateProductFilterConfig()
	QueryProductCertInfo()
	SetProductCertInfo()
	ReleaseProduct(productKey string) error
	CancelReleaseProduct(productKey string) error
}

type ThingModelAdminService interface {
	CreateThingModel(productKey string)
	UpdateThingModel(productKey string)
	CopyThingModel(targetProductKey, sourceProductKey string)
	PublishThingModel(productKey string)
	DeleteThingModel(productKey string)
	ListThingTemplates()
	GetThingTemplate()
	ListThingModelVersion()
	GetThingModelTsl()
	ImportThingModelTsl()
	QueryThingModelTslPublished()
	GetThingModelTslPublished()
	QueryThingModelExtendConfig()
	QueryThingModelExtendConfigPublished()
	CreateThingScript()
	UpdateThingScript()
	GetThingScript()
}

type ThingModelService interface {
	SetDeviceProperty()
	SetDevicesProperty()
	InvokeThingService()
	InvokeThingsService()
	QueryDevicePropertyData()
	QueryDevicePropertiesData()
	QueryDeviceEventData()
	QueryDeviceServiceData()
	SetDeviceDesiredProperty()
	QueryDeviceDesiredProperty()
	QUeryDevicePropertyStatus()
	QueryDeviceOriginalPropertyStatus()
	QueryDeviceOriginalEventData()
	QueryDeviceOriginalServiceData()
	ClearDeviceDesiredProperty()
}

type ProductTopicAdminService interface {
	CreateProductTopic()
	UpdateProductTopic()
	QueryProductTopic()
	DeleteProductTopic()
	CreateTopicRouteTable()
	QueryTopicRouteTable()
	QueryTopicReverseRouteTable()
	DeleteTopicRouteTable()
}
