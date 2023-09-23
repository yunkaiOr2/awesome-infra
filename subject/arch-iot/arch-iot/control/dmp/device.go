package dmp

type Device struct {
	DeviceName   string
	ProductKey   string
	DeviceId     string
	IotId        string
	DeviceSecret string
}

type DeviceState uint8

var (
	UN_ACTIVE DeviceState = 1
	ONLINE    DeviceState
	OFFLINE   DeviceState
	DISABLE   DeviceState
)

type DeviceQryService interface {
	GetByDeviceId(productKey, deviceId string) (Device, error)
	GetByIotId(iotId string) (Device, error)
}

type DeviceCmdService interface {
}
