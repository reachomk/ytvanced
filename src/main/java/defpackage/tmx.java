package defpackage;

import android.content.SharedPreferences;

/* renamed from: tmx */
class tmx implements tmt {
    tmx() {
        tfy tfy = new tfy();
    }

    public tev a(ter ter, String str, int i, String[] strArr) {
        return new tfv(rwd.b.a(tfy.a(ter), str, i, strArr), tfw.a);
    }

    public tev a(ter ter, String str, String[] strArr, int[] iArr) {
        return new tfv(rwd.b.a(tfy.a(ter), str, strArr, iArr), tfw.a);
    }

    public void a(SharedPreferences sharedPreferences, tmk tmk) {
        tmu tmu = (tmu) tmk;
        rwl.a(sharedPreferences, tmu.a.c);
        String str = "__phenotype_snapshot_token";
        sharedPreferences.edit().putString("__phenotype_server_token", tmu.a.b).putString(str, tmu.a.a).commit();
    }

    public final String a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("__phenotype_server_token", "");
    }
}
