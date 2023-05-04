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
	UNKNOWN DeviceState = 0
	ONLINE  DeviceState
	OFFLINE DeviceState
)

type DeviceQryService interface {
	GetByDeviceId(productKey, deviceId string) (Device, error)
	GetByIotId(iotId string) (Device, error)
}

type DeviceCmdService interface {
}
