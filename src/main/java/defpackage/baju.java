package defpackage;

import android.os.IInterface;

/* renamed from: baju */
public interface baju extends IInterface {
    boolean enableAsyncReprojection(int i);

    boolean enableCardboardTriggerEmulation(baka baka);

    long getNativeGvrContext();

    baka getRootView();

    bajv getUiLayout();

    void onBackPressed();

    void onPause();

    void onResume();

    boolean setOnDonNotNeededListener(baka baka);

    void setPresentationView(baka baka);

    void setReentryIntent(baka baka);

    void setStereoModeEnabled(boolean z);

    void shutdown();
}
