package defpackage;

import com.google.android.libraries.youtube.common.backgroundtask.firebase.FirebaseJobDispatcherService;

/* renamed from: djn */
final class djn implements wyg {
    private final /* synthetic */ diu a;

    public final void a(FirebaseJobDispatcherService firebaseJobDispatcherService) {
        firebaseJobDispatcherService.d = this.a.oM();
        String str = "device_context_task";
        str = "notification_timeout_task";
        str = "offline_r_charging";
        str = "offline_r";
        str = "offline_r_inc";
        str = "offline_pas";
        str = "offline_auto_offline";
        str = "transfer_dm2";
        str = "transfer_tw";
        str = "transfer_wifi_wakeup";
        str = "transfer_charger_wakeup";
        str = "transfer_connectivity_wakeup";
        str = "offline_client_state";
        str = "main_offline_auto_offline";
        str = "innertube_config_fetch_charging";
        str = "innertube_config_fetch";
        firebaseJobDispatcherService.e = amur.a(17).b("NetworkStatusReporter", this.a.jB()).b(str, this.a.jD()).b(str, this.a.jE()).b(str, this.a.jF()).b(str, this.a.jF()).b(str, this.a.jG()).b(str, this.a.jJ()).b(str, this.a.jK()).b(str, this.a.jL()).b(str, this.a.jN()).b(str, this.a.jO()).b(str, this.a.jO()).b(str, this.a.jO()).b(str, this.a.jS()).b(str, this.a.jT()).b(str, this.a.jU()).b(str, this.a.jU()).b();
        firebaseJobDispatcherService.f = this.a.jV();
        firebaseJobDispatcherService.g = this.a.oz();
    }

    /* synthetic */ djn(diu diu) {
        this.a = diu;
    }
}
