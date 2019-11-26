package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: nn */
public class nn extends atq implements mq, mr {
    public final ai a = new ai(this);
    public boolean b;
    public boolean c;
    private final no g = no.a(new nm(this));
    private boolean h;
    private boolean i;
    private boolean j = true;
    private int k;
    private aaf l;

    public nn(int i) {
        super(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.g.b();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            String str = (String) this.l.a(i3);
            this.l.b(i3);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            nf a = this.g.a(str);
            if (a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Activity result no fragment exists for who: ");
                stringBuilder.append(str);
                Log.w(str2, stringBuilder.toString());
                return;
            }
            a.a((char) i, i2, intent);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.g.a.d.a(z);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.g.a.d.b(z);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.b();
        this.g.a.d.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        nq nqVar = this.g.a;
        nqVar.d.a(nqVar, (np) nqVar, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            nq nqVar2 = this.g.a;
            if (nqVar2 instanceof bi) {
                nqVar2.d.a(parcelable);
                String str = "android:support:next_request_index";
                if (bundle.containsKey(str)) {
                    this.k = bundle.getInt(str);
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (!(intArray == null || stringArray == null)) {
                        int length = intArray.length;
                        if (length == stringArray.length) {
                            this.l = new aaf(length);
                            for (length = 0; length < intArray.length; length++) {
                                this.l.b(intArray[length], stringArray[length]);
                            }
                        }
                    }
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.l == null) {
            this.l = new aaf();
            this.k = 0;
        }
        super.onCreate(bundle);
        this.a.a(aa.ON_CREATE);
        this.g.a.d.l();
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(0, menu);
        no noVar = this.g;
        return onCreatePanelMenu | noVar.a.d.a(menu, getMenuInflater());
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = a(null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    private final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.g.a.d.onCreateView(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        this.g.a.d.r();
        this.a.a(aa.ON_DESTROY);
    }

    public final void onLowMemory() {
        super.onLowMemory();
        this.g.a.d.s();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.g.a.d.a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.g.a.d.b(menuItem);
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.g.a.d.b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.i = false;
        this.g.a.d.p();
        this.a.a(aa.ON_PAUSE);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.g.b();
    }

    public final void onStateNotSaved() {
        this.g.b();
    }

    public void onResume() {
        super.onResume();
        this.i = true;
        this.g.b();
        this.g.c();
    }

    /* Access modifiers changed, original: protected */
    public void onPostResume() {
        super.onPostResume();
        aY_();
    }

    public void aY_() {
        this.a.a(aa.ON_RESUME);
        this.g.a.d.o();
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.g.a.d.a(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        g();
        this.a.a(aa.ON_STOP);
        Parcelable k = this.g.a.d.k();
        if (k != null) {
            bundle.putParcelable("android:support:fragments", k);
        }
        if (this.l.c() > 0) {
            bundle.putInt("android:support:next_request_index", this.k);
            int[] iArr = new int[this.l.c()];
            String[] strArr = new String[this.l.c()];
            for (int i = 0; i < this.l.c(); i++) {
                iArr[i] = this.l.d(i);
                strArr[i] = (String) this.l.e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.j = false;
        if (!this.h) {
            this.h = true;
            this.g.a.d.m();
        }
        this.g.b();
        this.g.c();
        this.a.a(aa.ON_START);
        this.g.a.d.n();
    }

    public void onStop() {
        super.onStop();
        this.j = true;
        g();
        this.g.a.d.q();
        this.a.a(aa.ON_STOP);
    }

    @Deprecated
    public void w_() {
        invalidateOptionsMenu();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("  ");
        String stringBuilder2 = stringBuilder.toString();
        printWriter.print(stringBuilder2);
        printWriter.print("mCreated=");
        printWriter.print(this.h);
        printWriter.print(" mResumed=");
        printWriter.print(this.i);
        printWriter.print(" mStopped=");
        printWriter.print(this.j);
        if (getApplication() != null) {
            pv.a((af) this).a(stringBuilder2, fileDescriptor, printWriter, strArr);
        }
        this.g.a().a(str, fileDescriptor, printWriter, strArr);
    }

    public final nt f() {
        return this.g.a();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!(this.c || i == -1)) {
            nn.b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!(this.c || i == -1)) {
            nn.b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            nn.b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            nn.b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    static void b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public final void c_(int i) {
        if (!this.b && i != -1) {
            nn.b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.g.b();
        int i2 = i >>> 16;
        if (i2 != 0) {
            i2--;
            String str = (String) this.l.a(i2);
            this.l.b(i2);
            String str2 = "FragmentActivity";
            if (str == null) {
                Log.w(str2, "Activity result delivered for unknown Fragment.");
                return;
            }
            nf a = this.g.a(str);
            if (a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Activity result no fragment exists for who: ");
                stringBuilder.append(str);
                Log.w(str2, stringBuilder.toString());
            } else {
                a.a((char) i, strArr, iArr);
            }
        }
    }

    public final int a(nf nfVar) {
        if (this.l.c() < 65534) {
            while (this.l.f(this.k) >= 0) {
                this.k = (this.k + 1) % 65534;
            }
            int i = this.k;
            this.l.b(i, nfVar.i);
            this.k = (this.k + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    private final void g() {
        do {
        } while (nn.a(f(), z.CREATED));
    }

    private static boolean a(nt ntVar, z zVar) {
        int i = 0;
        for (nf nfVar : ntVar.f()) {
            if (nfVar != null) {
                if (nfVar.V.a.a(z.STARTED)) {
                    nfVar.V.a(zVar);
                    i = 1;
                }
                nv nvVar = nfVar.x;
                if (nvVar != null) {
                    i |= nn.a(nvVar, zVar);
                }
            }
        }
        return i != 0;
    }
}
