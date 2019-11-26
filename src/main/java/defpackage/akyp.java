package defpackage;

import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: akyp */
public class akyp extends ufk {
    private boolean a;
    public final ArrayList f = new ArrayList();
    public String g;

    public akyp(String str) {
        super(str);
    }

    public final int c() {
        return R.layout.bottom_sheet_enableable_list_item;
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            d();
        }
    }

    public boolean a() {
        return this.a;
    }

    public final void a(String str) {
        if (!amqq.a(this.g, str)) {
            this.g = str;
            d();
        }
    }

    private final void d() {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((akyo) arrayList.get(i)).a();
        }
    }
}
