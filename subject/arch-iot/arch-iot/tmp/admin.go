package tmp

/*

 */
type ProductAdminService interface {
	CancelReleaseProduct(productKey string) error
	CreateProduct()
	UpdateProduct()
	QueryProductList()
	QueryProduct()
	DeleteProduct()
	CreateProductTags()
}

type ThingModelAdminService interface {
	CreateThingModel(productKey string)
	UpdateThingModel(productKey string)
	CopyThingModel(targetProductKey, sourceProductKey string)
	PublishThingModel(productKey string)
	DeleteThingModel(productKey string)
	ImportThingModelTsl()
}
