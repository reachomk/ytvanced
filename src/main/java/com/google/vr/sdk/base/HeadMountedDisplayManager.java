package com.google.vr.sdk.base;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import defpackage.bahi;
import defpackage.bahk;

public class HeadMountedDisplayManager {
    public final Context context;
    public final HeadMountedDisplay hmd = new HeadMountedDisplay(createScreenParams(), createGvrViewerParams());
    public final bahi paramsProvider;

    public HeadMountedDisplayManager(Context context) {
        this.context = context;
        this.paramsProvider = bahk.a(context);
    }

    public void onPause() {
    }

    public HeadMountedDisplay getHeadMountedDisplay() {
        return this.hmd;
    }

    public void onResume() {
        CardboardDevice$DeviceParams a = this.paramsProvider.a();
        ScreenParams screenParams = null;
        GvrViewerParams gvrViewerParams = a != null ? new GvrViewerParams(a) : null;
        if (!(gvrViewerParams == null || gvrViewerParams.equals(this.hmd.getGvrViewerParams()))) {
            this.hmd.setGvrViewerParams(gvrViewerParams);
        }
        Display$DisplayParams c = this.paramsProvider.c();
        if (c != null) {
            screenParams = ScreenParams.fromProto(getDisplay(), c);
        }
        if (screenParams != null && !screenParams.equals(this.hmd.getScreenParams())) {
            this.hmd.setScreenParams(screenParams);
        }
    }

    public void close() {
        this.paramsProvider.e();
    }

    private Display getDisplay() {
        return ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
    }

    private ScreenParams createScreenParams() {
        Display display = getDisplay();
        ScreenParams fromProto = ScreenParams.fromProto(display, this.paramsProvider.c());
        return fromProto == null ? new ScreenParams(display) : fromProto;
    }

    private GvrViewerParams createGvrViewerParams() {
        return new GvrViewerParams(this.paramsProvider.a());
    }
}
