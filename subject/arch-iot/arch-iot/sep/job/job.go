package job

/*
任务api
*/
type JobService interface {
	CreateJob()
	GenerateFileUploadURL()
	UpdateJob()
	QueryJob()
	ListJob()
	CancelJob()
	DeleteJob()
	ListTask()
	QueryTask()
	QueryJobStatistics()
	RerunJob()
}
