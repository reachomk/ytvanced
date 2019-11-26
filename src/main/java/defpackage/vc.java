package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vc */
final class vc implements vd {
    private final Messenger a;

    vc(Messenger messenger) {
        this.a = messenger;
    }

    public final IBinder a() {
        return this.a.getBinder();
    }

    public final void a(String str, xo xoVar, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("extra_service_version", 2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putParcelable("data_media_session_token", xoVar);
        bundle2.putBundle("data_root_hints", bundle);
        a(1, bundle2);
    }

    public final void b() {
        a(2, null);
    }

    public final void a(String str, List list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", null);
        if (list != null) {
            ArrayList arrayList;
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            bundle2.putParcelableArrayList("data_media_item_list", arrayList);
        }
        a(3, bundle2);
    }

    private final void a(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        this.a.send(obtain);
    }
}
