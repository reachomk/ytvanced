package defpackage;

import android.media.MediaDrm;
import android.media.MediaDrm.KeyStatus;
import android.media.MediaDrm.OnKeyStatusChangeListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nqm */
public final class nqm implements OnKeyStatusChangeListener {
    private final /* synthetic */ nqf a;
    private final /* synthetic */ nqk b;

    public nqm(nqk nqk, nqf nqf) {
        this.b = nqk;
        this.a = nqf;
    }

    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (KeyStatus nqn : list) {
            arrayList.add(new nqn(nqn));
        }
        this.a.onKeyStatusChange(this.b, bArr, arrayList, z);
    }
}
