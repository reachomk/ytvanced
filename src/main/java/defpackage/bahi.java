package defpackage;

import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParamsList;

/* renamed from: bahi */
public interface bahi {
    anex a(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest);

    CardboardDevice$DeviceParams a();

    boolean a(CardboardDevice$DeviceParams cardboardDevice$DeviceParams);

    CardboardDevice$DeviceParamsList b();

    Display$DisplayParams c();

    Preferences$UserPrefs d();

    void e();
}
