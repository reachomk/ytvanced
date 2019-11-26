package defpackage;

import com.google.android.libraries.youtube.common.backgroundtask.firebase.FirebaseJobDispatcherService;

/* renamed from: wyh */
public final /* synthetic */ class wyh implements Runnable {
    private final FirebaseJobDispatcherService a;
    private final der b;

    public wyh(FirebaseJobDispatcherService firebaseJobDispatcherService, der der) {
        this.a = firebaseJobDispatcherService;
        this.b = der;
    }

    public final void run() {
        FirebaseJobDispatcherService firebaseJobDispatcherService = this.a;
        der der = this.b;
        firebaseJobDispatcherService.a(der, firebaseJobDispatcherService.f.a(der.c(), der.h()) == 2);
    }
}
