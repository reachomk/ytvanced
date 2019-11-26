package com.google.vr.ndk.base;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.baff;
import defpackage.baju;

public class GvrLayout extends FrameLayout {
    public GvrApi gvrApi;
    public baju impl;
    public GvrUiLayout uiLayout;
    public ExternalSurface videoSurface;

    public GvrLayout(Context context) {
        super(context);
        if (baff.a(context) != null) {
            init();
            return;
        }
        throw new IllegalArgumentException("An Activity Context is required for VR functionality.");
    }

    private void init() {
        TraceCompat.beginSection("GvrLayout.init");
        try {
            if (this.impl == null) {
                this.impl = GvrLayoutFactory.create(getContext());
            }
            this.uiLayout = new GvrUiLayout(this.impl.getUiLayout());
            if (this.gvrApi == null) {
                this.gvrApi = new GvrApi(getContext(), this.impl.getNativeGvrContext());
            }
            addView((View) ObjectWrapper.a(this.impl.getRootView(), View.class));
            TraceCompat.endSection();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            TraceCompat.endSection();
        }
    }

    public GvrUiLayout getUiLayout() {
        return this.uiLayout;
    }

    public void onPause() {
        TraceCompat.beginSection("GvrLayout.onPause");
        try {
            this.impl.onPause();
            TraceCompat.endSection();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            TraceCompat.endSection();
        }
    }

    public void onResume() {
        TraceCompat.beginSection("GvrLayout.onResume");
        try {
            this.impl.onResume();
            TraceCompat.endSection();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            TraceCompat.endSection();
        }
    }

    public void shutdown() {
        TraceCompat.beginSection("GvrLayout.shutdown");
        try {
            ExternalSurface externalSurface = this.videoSurface;
            if (externalSurface != null) {
                externalSurface.shutdown();
                this.videoSurface = null;
            }
            this.impl.shutdown();
            this.gvrApi.shutdown();
            TraceCompat.endSection();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            TraceCompat.endSection();
        }
    }

    public void setPresentationView(View view) {
        try {
            this.impl.setPresentationView(ObjectWrapper.a(view));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean setAsyncReprojectionEnabled(boolean z) {
        if (z) {
            try {
                return this.impl.enableAsyncReprojection(0);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else if (!this.gvrApi.getAsyncReprojectionEnabled()) {
            return true;
        } else {
            throw new UnsupportedOperationException("Async reprojection cannot be disabled once enabled.");
        }
    }

    public boolean enableAsyncReprojectionProtected() {
        try {
            return this.impl.enableAsyncReprojection(1);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public GvrApi getGvrApi() {
        return this.gvrApi;
    }

    public void setStereoModeEnabled(boolean z) {
        try {
            this.impl.setStereoModeEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
