package defpackage;

import android.os.Bundle;
import com.google.android.youtube.api.service.EmbedFirebaseJobDispatcherService;

/* renamed from: mmc */
public final class mmc implements wye {
    private final Bundle a = new Bundle();

    mmc(mni mni, boolean z, String str) {
        this.a.putString("package_name", mni.a);
        this.a.putString("version_name", mni.b);
        this.a.putString("developer_key", mni.c);
        this.a.putString("client_library_version_name", str);
        this.a.putBoolean("is_internal_application_with_sign_in", z);
    }

    public final Class a() {
        return EmbedFirebaseJobDispatcherService.class;
    }

    public final Bundle b() {
        return this.a;
    }
}
