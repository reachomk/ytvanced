package defpackage;

import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alnm */
public final class alnm extends AsyncTask {
    private final alnp a;
    private List b;
    private boolean c;
    private final /* synthetic */ alnn d;

    public alnm(alnn alnn, alnp alnp) {
        this.d = alnn;
        this.a = alnp;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        if (this.c) {
            alnn alnn = this.d;
            alnn.e = this.b;
            alnn.b();
            alnp alnp = this.a;
            if (alnp != null) {
                alnp.a(this.d);
            }
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        boolean z = true;
        if (strArr.length == 0 || TextUtils.isEmpty(strArr[0])) {
            this.b = null;
            this.c = this.d.e != null;
        } else {
            this.b = new ArrayList();
            this.c = this.d.e == null;
            String str = "[\\s\\p{Punct}]+";
            strArr = alnn.a(strArr[0]).split(str);
            int i = 0;
            while (i < this.d.a.size() && !isCancelled()) {
                int size;
                String a = this.d.b.a(this.d.a.get(i));
                if (strArr != null) {
                    String[] split = alnn.a(a).split(str);
                    int length = strArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = strArr[i2];
                        int length2 = split.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            if (split[i3].startsWith(str2)) {
                                i2++;
                            } else {
                                i3++;
                            }
                        }
                        if (this.d.e != null) {
                            size = this.b.size();
                            if (this.d.e.size() > size && ((Integer) this.d.e.get(size)).equals(Integer.valueOf(i))) {
                                this.c = true;
                            }
                        }
                        i++;
                    }
                }
                List list = this.b;
                Integer valueOf = Integer.valueOf(i);
                list.add(valueOf);
                if (this.d.e != null) {
                    size = this.b.size() - 1;
                    if (this.d.e.size() <= size || !((Integer) this.d.e.get(size)).equals(valueOf)) {
                        this.c = true;
                    }
                }
                i++;
            }
        }
        List list2 = this.d.e;
        boolean z2 = list2 == null;
        if (this.b != null) {
            z = false;
        }
        if (z2 != z) {
            if (list2 != null && list2.size() == this.d.a.size()) {
                this.c = false;
            }
            list2 = this.b;
            if (list2 != null && list2.size() == this.d.a.size()) {
                this.c = false;
            }
        }
        return null;
    }
}
