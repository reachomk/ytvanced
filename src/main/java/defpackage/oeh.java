package defpackage;

import android.media.MediaDrm;
import android.media.MediaDrm.KeyStatus;
import android.media.MediaDrm.OnKeyStatusChangeListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oeh */
public final /* synthetic */ class oeh implements OnKeyStatusChangeListener {
    private final oef a;
    private final oee b;

    public oeh(oef oef, oee oee) {
        this.a = oef;
        this.b = oee;
    }

    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        oef oef = this.a;
        oee oee = this.b;
        ArrayList arrayList = new ArrayList();
        for (KeyStatus keyStatus : list) {
            arrayList.add(new oec(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        oee.a(oef, arrayList);
    }
}
