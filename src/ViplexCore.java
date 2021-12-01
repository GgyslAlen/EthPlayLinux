import com.sun.jna.Library;
import com.sun.jna.Callback;

public interface ViplexCore extends Library {
    public interface CallBack extends Callback {
        void  dataCallBack(int code, String data);
    }

    void nvSetDevLang(String devLang);
    int nvInit(String sdkRootDir, String data);
    void nvSearchTerminalAsync(CallBack callBack);
	void nvSetPlatform(String platform);
	void nvPingAsync(CallBack callBack);
	void nvStopPublicNetAsync(CallBack callBack);
	void nvFindAllTerminalsAsync(CallBack callBack);
	void nvInitPublicNetAsync(String data, CallBack connectCallback, CallBack disconnectCallback);
	void nvGetOnlineDevicesAsync(CallBack callback);
    void nvRsaDecodeAsync(String data, CallBack callBack);
    void nvRsaEncodeAsync(String data, CallBack callBack);
    void nvNewSetBindPlayerAsync(String data, CallBack callBack);
    void nvSetScreenShotAsync(String data, CallBack callBack);
    void nvGetWifiCurrentStatusAsync(String data, CallBack callBack);
    void nvStartUploadApkAsync(String data, CallBack callBack);
    void nvRebootAsync(String data, CallBack callBack);
    void nvGetManualBrightnessFor0x99Async(String data, CallBack callBack);
    void nvGetEnvironmentBrightnessParameterAsync(String data, CallBack callBack);
    void nvSetEnvironmentBrightnessParameterAsync(String data, CallBack callBack);
    void nvRegisterVnnox(String data, CallBack callBack);
    void nvGetVerifyCode(String data, CallBack callBack);
    void nvLoginVnnox(String data, CallBack callBack);
    void nvGetScreenDeviceInfoAsync(String data, CallBack callBack);
    void nvCancelFunctionAsync(String data, CallBack callBack);
    void nvDownloadTerminalPlayLogAsync(String data, CallBack callBack);
    void nvDownloadTerminalAllLogAsync(String data, CallBack callBack);
    void nvCheckNetworkAsync(String data, CallBack callBack);
    void nvUploadTerminalLogAsync(String data, CallBack callBack);
    void nvDownloadTerminalLogAsync(String data, CallBack callBack);
    void nvGetTimeZoneAsync(String data, CallBack callBack);
    void nvGetTokenAsync(String data, CallBack callBack);
    void nvIsExistPlayerNameAsync(String data, CallBack callBack);
    void nvGetPlayerIdentiferAsync(String data, CallBack callBack);
    void nvIsCommonCloudAsync(String data, CallBack callBack);
    void nvFinishDataAsync(String data, CallBack callBack);
    void nvStartGetAvailableMemoryDataAsync(String data, CallBack callBack);
    void nvUploadFeedBackFileStateAsync(String data, CallBack callBack);
    void nvUploadFeedbackInfoAsync(String data, CallBack callBack);
    void nvAddNodeServerInfoListAsync(String data, CallBack callBack);
    void nvChangeNodeServerListAsync(String data, CallBack callBack);
    void nvDeleteNodeServerListAsync(String data, CallBack callBack);
    void nvAddNodeServerListAsync(String data, CallBack callBack);
    void nvGetNodeServerListAsync(String data, CallBack callBack);
    void nvSetAudioMedioProgramAsync(String data, CallBack callBack);
    void nvGetFileMD5Async(String data, CallBack callBack);
    void nvGetCustomerTplAsync(String data, CallBack callBack);
    void nvStopProgramTransferAsync(String data, CallBack callBack);
    void nvStartTransferProgramAsync(String data, CallBack callBack);
    void nvDeleteProgramAsync(String data, CallBack callBack);
    void nvGetProgramAsync(String data, CallBack callBack);
    void nvDeleteTplAsync(String data, CallBack callBack);
    void nvEditTplAsync(String data, CallBack callBack);
    void nvAddTplAsync(String data, CallBack callBack);
    void nvSetSystemTplInfoAsync(String data, CallBack callBack);
    void nvMakeProgramAsync(String data, CallBack callBack);
    void nvSetPageProgramsAsync(String data, CallBack callBack);
    void nvSetPageProgramAsync(String data, CallBack callBack);
    void nvCreateProgramAsync(String data, CallBack callBack);
    void nvQueryFileByTypeAsync(String data, CallBack callBack);
    void nvDownLoadFilesAsync(String data, CallBack callBack);
    void nvDataBaseMigrationAsync(String data, CallBack callBack);
    void nvGetScreenUnitTempAsync(String data, CallBack callBack);
    void nvSetTimeAndZoneAsync(String data, CallBack callBack);
    void nvGetDisplayInfoAsync(String data, CallBack callBack);
    void nvGetRotationAsync(String data, CallBack callBack);
    void nvSetRotationAsync(String data, CallBack callBack);
    void nvDownLoadScreenshotAsync(String data, CallBack callBack);
    void nvGetIsUseDayLightTimeAsync(String data, CallBack callBack);
    void nvAddNetTimingInfoListAsync(String data, CallBack callBack);
    void nvUpdateNetTimingInfoAsync(String data, CallBack callBack);
    void nvDeleteNetTimingInfoAsync(String data, CallBack callBack);
    void nvAddNetTimingInfoAsync(String data, CallBack callBack);
    void nvGetNetTimingListInfoAsync(String data, CallBack callBack);
    void nvSetNetTimingInfoAsync(String data, CallBack callBack);
    void nvGetNetTimingInfoAsync(String data, CallBack callBack);
    void nvCalibrateTimeAsync(String data, CallBack callBack);
    void nvGetCurrentTimeAndZoneAsync(String data, CallBack callBack);
    void nvGetMonitorInfoByReceiverIndexAsync(String data, CallBack callBack);
    void nvGetReceiverCountAndInfoAsync(String data, CallBack callBack);
    void nvGetSendCardMonitorInfoAsync(String data, CallBack callBack);
    void nvGetAvailableMemoryAsync(String data, CallBack callBack);
    void nvGetCPUTempAsync(String data, CallBack callBack);
    void nvGetCPUUsageAsync(String data, CallBack callBack);
    void nvGetAvailableStorageDataAsync(String data, CallBack callBack);
    void nvGetBindPlayerAsync(String data, CallBack callBack);
    void nvGetCloudPlayerListAsync(String data, CallBack callBack);
    void nvSetBindPlayerAsync(String data, CallBack callBack);
    void nvSetIcareConfigInfoAsync(String data, CallBack callBack);
    void nvGetIcareConfigInfoAsync(String data, CallBack callBack);
    void nvSetRecvCardFileAsync(String data, CallBack callBack);
    void nvSetScreenAttributeAsync(String data, CallBack callBack);
    void nvGetScreenAttributeAsync(String data, CallBack callBack);
    void nvGetModuleInfoAsync(String data, CallBack callBack);
    void nvSetWifiApStationSwitchAsync(String data, CallBack callBack);
    void nvSetAPNetworkOpenStatusAsync(String data, CallBack callBack);
    void nvGetAPNetworkOpenStatusAsync(String data, CallBack callBack);
    void nvGet4GNetworkStatusAsync(String data, CallBack callBack);
    void nvGetFlightModeAsync(String data, CallBack callBack);
    void nvSetFlightModeAsync(String data, CallBack callBack);
    void nvSetAPNInfoAsync(String data, CallBack callBack);
    void nvGetAPNInfoAsync(String data, CallBack callBack);
    void nvSetAPNetworkAsync(String data, CallBack callBack);
    void nvGetAPNetworkAsync(String data, CallBack callBack);
    void nvSetEthernetInfoAsync(String data, CallBack callBack);
    void nvGetEthernetInfoAsync(String data, CallBack callBack);
    void nvIsMobileModuleExistedAsync(String data, CallBack callBack);
    void nvSetMobileNetworkAsync(String data, CallBack callBack);
    void nvGetMobileNetworkAsync(String data, CallBack callBack);
    void nvSendForgetWifiCommandAsync(String data, CallBack callBack);
    void nvSetWifiEnabledAsync(String data, CallBack callBack);
    void nvGetWifiEnabledAsync(String data, CallBack callBack);
    void nvDisconnectWifiNetworkAsync(String data, CallBack callBack);
    void nvConnectWifiNetworkAsync(String data, CallBack callBack);
    void nvGetWifiListAsync(String data, CallBack callBack);
    void nvUpdateVerifyAsync(String data, CallBack callBack);
    void nvStopCurrentUpdateTaskAsync(String data, CallBack callBack);
    void nvUpdateOSAsync(String data, CallBack callBack);
    void nvUpdateAppAsync(String data, CallBack callBack);
    void nvReadFileContentFromZipFileAsync(String data, CallBack callBack);
    void nvStopDownloadUpgradeFileAsync(String data, CallBack callBack);
    void nvDownloadUpgradeFileAsync(String data, CallBack callBack);
    void nvGetOnlineUpgradeFileAsync(String data, CallBack callBack);
    void nvQueryUpdateFileByTypeAsync(String data, CallBack callBack);
    void nvDeleteCollectorAsync(String data, CallBack callBack);
    void nvAddCollectorAsync(String data, CallBack callBack);
    void nvGetPickerReceiverAsync(String data, CallBack callBack);
    void nvSetCustomResolutionAsync(String data, CallBack callBack);
    void nvSetHdmiOutputStatusAsync(String data, CallBack callBack);
    void nvGetHdmiOutputStatusAsync(String data, CallBack callBack);
    void nvSetReBootTaskAsync(String data, CallBack callBack);
    void nvGetReBootTaskAsync(String data, CallBack callBack);
    void nvGetSupportedResolutionAsync(String data, CallBack callBack);
    void nvGetCurrentResolutionAsync(String data, CallBack callBack);
    void nvSetCurrentResolutioAsync(String data, CallBack callBack);
    void nvSetOTGUSBModeAsync(String data, CallBack callBack);
    void nvGetOTGUSBModeAsync(String data, CallBack callBack);
    void nvClearAllMediasAsync(String data, CallBack callBack);
    void nvSetReBootWipeUserDataAsync(String data, CallBack callBack);
    void nvGetSyncPlayAsync(String data, CallBack callBack);
    void nvSetSyncPlayAsync(String data, CallBack callBack);
    void nvStopPlayAsync(String data, CallBack callBack);
    void nvResumePlayAsync(String data, CallBack callBack);
    void nvPausePlayAsync(String data, CallBack callBack);
    void nvStartPlayAsync(String data, CallBack callBack);
    void nvDeletePlayListAsync(String data, CallBack callBack);
    void nvGetProgramInfoAsync(String data, CallBack callBack);
    void nvGetScreenPowerPolicyFor0x99Async(String data, CallBack callBack);
    void nvGetScreenPowerManual0x99Async(String data, CallBack callBack);
    void nvsetScreenPowerPolicy0x99Async(String data, CallBack callBack);
    void nvsetScreenPowerManual0x99Async(String data, CallBack callBack);
    void nvSetScreenPowerPolicyAsync(String data, CallBack callBack);
    void nvGetScreenPowerPolicyAsync(String data, CallBack callBack);
    void nvGetScreenPowerStateAsync(String data, CallBack callBack);
    void nvSetScreenPowerStateAsync(String data, CallBack callBack);
    void nvGetScreenPowerModeAsync(String data, CallBack callBack);
    void nvSetScreenPowerModeAsync(String data, CallBack callBack);
    void nvSetColorTemperatureAsync(String data, CallBack callBack);
    void nvGetColorTemperatureAsync(String data, CallBack callBack);
    void nvgetPolicyBrightnessFor0x99Async(String data, CallBack callBack);
    void nvsetPolicyBrightnessFor0x99Async(String data, CallBack callBack);
    void nvsetManualBrightnessFor0x99Async(String data, CallBack callBack);
    void nvGetEnvironmentBrightnessAsync(String data, CallBack callBack);
    void nvSetBrightnessPolicyAsync(String data, CallBack callBack);
    void nvGetBrightnessPolicyAsync(String data, CallBack callBack);
    void nvGetScreenBrightnessAsync(String data, CallBack callBack);
    void nvSetScreenBrightnessAsync(String data, CallBack callBack);
    void nvGetBrightnessAdjustModeAsync(String data, CallBack callBack);
    void nvSetBrightnessAdjustModeAsync(String data, CallBack callBack);
    void nvGetconfigurationAsync(String data, CallBack callBack);
    void nvGetProductInfoAsync(String data, CallBack callBack);
    void nvGetInstalledPackageVersionsAsync(String data, CallBack callBack);
    void nvGetFirmwareInfosAsync(String data, CallBack callBack);
    void nvLogoutAsync(String data, CallBack callBack);
    void nvSetSystemInfoAsync(String data, CallBack callBack);
    void nvSetTerminalInfoAsync(String data, CallBack callBack);
    void nvGetTerminalInfoAsync(String data, CallBack callBack);
    void nvSetScreenInfoAsync(String data, CallBack callBack);
    void nvDelTerminalInfoAsync(String data, CallBack callBack);
    void nvChangePassWordAsync(String data, CallBack callBack);
    void nvLoginAsync(String data, CallBack callBack);
    void nvSearchRangeIpAsync(String data, CallBack callBack);
    void nvSearchAppointIpAsync(String data, CallBack callBack);
    void nvGetUserInfoAsync(String data, CallBack callBack);
    void nvSetUserInfoAsync(String data, CallBack callBack);
    void nvSetVideoSourcePolicyFor0x99Async(String data, CallBack callBack);
    void nvGetVideoSourcePolicyFor0x99Async(String data, CallBack callBack);
    void nvSetVideoSourceManualFor0x99Async(String data, CallBack callBack);
    void nvGetVideoSourceManualFor0x99Async(String data, CallBack callBack);
    void nvGetVideoEDIDAsync(String data, CallBack callBack);
    void nvSetVideoEDIDAsync(String data, CallBack callBack);
    void nvSetVideoControlInfoAsync(String data, CallBack callBack);
    void nvGetVideoControlInfoAsync(String data, CallBack callBack);
    void nvSetRelayPowerStatusAsync(String data, CallBack callBack);
    void nvGetRelayPowerStatusAsync(String data, CallBack callBack);
    void nvGetRelayPowerPolicyAsync(String data, CallBack callBack);
    void nvSetRelayPowerPolicyAsync(String data, CallBack callBack);
    void nvSetRelayPowerManualAsync(String data, CallBack callBack);
    void nvGetPowerModeAsync(String data, CallBack callBack);
    void nvSetPowerModeAsync(String data, CallBack callBack);
    void nvGetPowerInfoStatusAsync(String data, CallBack callBack);
    void nvGetPowerInfoPolicyAsync(String data, CallBack callBack);
    void nvSetPowerInfoPolicyAsync(String data, CallBack callBack);
    void nvSetPowerInfoManualAsync(String data, CallBack callBack);
    void nvGetLoraInfoAsync(String data, CallBack callBack);
    void nvSetSupportSensorInfoAsync(String data, CallBack callBack);
    void nvGetSupportSensorInfoAsync(String data, CallBack callBack);
    void nvSetSpliceInfoAsync(String data, CallBack callBack);
    void nvGetSpliceInfoAsync(String data, CallBack callBack);
    void nvUpdateFontAsync(String data, CallBack callBack);
    void nvDeleteFontAsync(String data, CallBack callBack);
    void nvGetTerminalFontAsync(String data, CallBack callBack);
    void nvGetPlaylogPathAsync(String data, CallBack callBack);
    void nvStartUploadApkCoreAsync(String data, CallBack callBack);
    void nvUninstallPackageAsync(String data, CallBack callBack);
    void nvForceStopAppAsync(String data, CallBack callBack);
    void nvGetRunningPackageInfoAsync(String data, CallBack callBack);
    void nvGetInstalledPackageInfoAsync(String data, CallBack callBack);
    void nvSetVPNConnectInfoAsync(String data, CallBack callBack);
    void nvGetVPNConnectInfoAsync(String data, CallBack callBack);
    void nvGetTimingVolumeFor0x99Async(String data, CallBack callBack);
    void nvSetTimingVolumeFor0x99Async(String data, CallBack callBack);
    void nvSetVolumeFor0x99Async(String data, CallBack callBack);
    void nvGetVolumeFor0x99Async(String data, CallBack callBack);
    void nvGetTimingVolumeAsync(String data, CallBack callBack);
    void nvSetTimingVolumeAsync(String data, CallBack callBack);
    void nvSetVolumeAsync(String data, CallBack callBack);
    void nvGetVolumeAsync(String data, CallBack callBack);
    void nvGetManualPowerSwitchStatusAsync(String data, CallBack callBack);
    void nvSetManualPowerSwitchStatusAsync(String data, CallBack callBack);
    void nvGetRealtimePowerSwitchStatusAsync(String data, CallBack callBack);
    void nvGetTimingPowerSwitchStatusAsync(String data, CallBack callBack);
    void nvSetTimingPowerSwitchStatusAsync(String data, CallBack callBack);
    void nvGetPublicNetParamAsync(String data, CallBack callBack);
    void nvDisconnectPublicNetAsync(String data, CallBack callBack);
    void nvSetPublicNetConfigParamAsync(String data, CallBack callBack);
    
}   

