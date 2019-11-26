package com.google.vr.ndk.base;

import android.content.Context;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import defpackage.andw;
import defpackage.anfb;
import defpackage.angf;
import defpackage.baez;
import defpackage.bafa;
import defpackage.bafh;
import defpackage.bahi;
import defpackage.bahk;
import defpackage.bakl;

class SdkDaydreamTouchListener extends AbstractDaydreamTouchListener implements OnTouchListener {
    public final GvrApi gvrApi;
    public final GvrLayoutImpl gvrLayout;
    public final boolean isDaydreamImageAlignmentEnabled;
    public final bahi vrParamsProvider;

    class FinishInitializationTask extends AsyncTask {
        public Display display;

        private FinishInitializationTask() {
        }

        /* Access modifiers changed, original: protected|varargs */
        public void onProgressUpdate(Void... voidArr) {
        }

        /* Access modifiers changed, original: protected|varargs */
        public Display$DisplayParams doInBackground(Void... voidArr) {
            return SdkDaydreamTouchListener.this.vrParamsProvider.c();
        }

        /* Access modifiers changed, original: protected */
        public void onPostExecute(Display$DisplayParams display$DisplayParams) {
            bafa bafa = new bafa();
            SdkDaydreamTouchListener.this.init(bafh.a(this.display, display$DisplayParams), display$DisplayParams, bafa.a(this.display));
        }
    }

    class RefreshViewerProfileTask extends AsyncTask {
        private RefreshViewerProfileTask() {
        }

        /* Access modifiers changed, original: protected|varargs */
        public void onProgressUpdate(Void... voidArr) {
        }

        /* Access modifiers changed, original: protected|varargs */
        public CardboardDevice$DeviceParams doInBackground(Void... voidArr) {
            return SdkDaydreamTouchListener.this.vrParamsProvider.a();
        }

        /* Access modifiers changed, original: protected */
        public void onPostExecute(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
            SdkDaydreamTouchListener.this.setDeviceParams(cardboardDevice$DeviceParams);
        }
    }

    public SdkDaydreamTouchListener(GvrLayoutImpl gvrLayoutImpl) {
        this.gvrLayout = gvrLayoutImpl;
        this.gvrApi = gvrLayoutImpl.getGvrApi();
        anfb a = anfb.a(this.gvrApi.getSdkConfigurationParams().daydreamImageAlignment_);
        if (a == null) {
            a = anfb.UNKNOWN_ALIGNMENT;
        }
        boolean z = (a == anfb.DISABLED || this.gvrApi.getSdkConfigurationParams().touchOverlayEnabled_) ? false : true;
        this.isDaydreamImageAlignmentEnabled = z;
        Context context = gvrLayoutImpl.getContext();
        this.vrParamsProvider = bahk.a(context);
        FinishInitializationTask finishInitializationTask = new FinishInitializationTask();
        finishInitializationTask.display = bafh.a(context);
        finishInitializationTask.execute(new Void[0]);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return handleTouch(motionEvent, 0.0f, 0.0f);
    }

    public void refreshViewerProfile() {
        new RefreshViewerProfileTask().execute(new Void[0]);
    }

    public void shutdown() {
        this.vrParamsProvider.e();
    }

    private void init(DisplayMetrics displayMetrics, Display$DisplayParams display$DisplayParams, baez baez) {
        initWithDisplayParams(displayMetrics, display$DisplayParams, baez);
        refreshViewerProfile();
    }

    /* Access modifiers changed, original: protected */
    public boolean isDaydreamImageAlignmentEnabled() {
        return this.isDaydreamImageAlignmentEnabled;
    }

    /* Access modifiers changed, original: protected */
    public void setLensOffset(float f, float f2, float f3) {
        this.gvrApi.setLensOffset(f, f2, 0.0f);
    }

    /* Access modifiers changed, original: protected */
    public void logEvent(andw andw, angf angf) {
        String str = "SdkDaydreamTouchListener";
        if (this.gvrLayout.getVrCoreSdkClient() == null || this.gvrLayout.getVrCoreSdkClient().getLoggingService() == null) {
            Log.w(str, "Unable to log alignment event; logging service not available.");
            return;
        }
        try {
            this.gvrLayout.getVrCoreSdkClient().getLoggingService().a(new bakl(andw.SDK_PHONE_ALIGNMENT, angf));
        } catch (RemoteException unused) {
            Log.w(str, "Unable to log alignment event");
        }
    }
}
