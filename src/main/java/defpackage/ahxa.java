package defpackage;

import android.content.Context;
import com.google.vr.sdk.base.HeadsetSelector.HeadsetInfo;

/* renamed from: ahxa */
public final class ahxa extends akyk {
    public final HeadsetInfo a;

    ahxa(Context context, HeadsetInfo headsetInfo) {
        super(context, headsetInfo.getDisplayName());
        this.a = headsetInfo;
    }
}
