package defpackage;

import android.content.Context;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParamsList;

/* renamed from: bafy */
public final class bafy implements bahi {
    private final Context a;

    public bafy(Context context) {
        this.a = context.getApplicationContext();
    }

    public final anex a(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return null;
    }

    public final Preferences$UserPrefs d() {
        return null;
    }

    public final void e() {
    }

    public final CardboardDevice$DeviceParams a() {
        return (CardboardDevice$DeviceParams) bafe.a(CardboardDevice$DeviceParams.class, "current_device_params");
    }

    public final boolean a(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams != null) {
            return bafe.a(cardboardDevice$DeviceParams);
        }
        return bafe.b();
    }

    public final Display$DisplayParams c() {
        Display$DisplayParams a = bafe.a();
        return a == null ? bagd.a(this.a) : a;
    }

    public final CardboardDevice$DeviceParamsList b() {
        CardboardDevice$DeviceParamsList cardboardDevice$DeviceParamsList = new CardboardDevice$DeviceParamsList();
        cardboardDevice$DeviceParamsList.params = new CardboardDevice$DeviceParams[0];
        return cardboardDevice$DeviceParamsList;
    }

    static {
        bafy.class.getSimpleName();
    }
}
