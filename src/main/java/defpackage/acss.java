package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;

/* renamed from: acss */
public final class acss implements Runnable {
    private final /* synthetic */ DeveloperPanel a;

    public acss(DeveloperPanel developerPanel) {
        this.a = developerPanel;
    }

    public final void run() {
        this.a.postDelayed(this, 1000);
    }
}
