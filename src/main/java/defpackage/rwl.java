package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rwl */
public abstract class rwl {
    public long a = 2000;
    private final rwf b;
    private final String c;

    @Deprecated
    public rwl(ptd ptd, String str) {
        this.b = rwd.a(ptd.a());
        this.c = str;
    }

    public abstract void a(rvu rvu);

    private final rvu a(String str, String str2) {
        try {
            return (rvu) rym.a(this.b.a(new rww(str, str2)), this.a, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 31);
            stringBuilder.append("Retrieving snapshot for ");
            stringBuilder.append(str);
            stringBuilder.append(" failed");
            Log.e("PhenotypeFlagCommitter", stringBuilder.toString(), e);
            return null;
        }
    }

    public final boolean a(String str) {
        int i = 3;
        while (true) {
            String str2 = "PhenotypeFlagCommitter";
            if (i <= 0) {
                str = String.valueOf(this.c);
                String str3 = "No more attempts remaining, giving up for ";
                Log.w(str2, str.length() == 0 ? new String(str3) : str3.concat(str));
                return false;
            }
            rvu a = a(this.c, str);
            if (a == null) {
                return false;
            }
            a(a);
            try {
                rym.a(this.b.a(new rwz(a.a)), this.a, TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String str4 = this.c;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str4).length() + 41);
                stringBuilder.append("Committing snapshot for ");
                stringBuilder.append(str4);
                stringBuilder.append(" failed, retrying");
                Log.w(str2, stringBuilder.toString(), e);
                i--;
            }
        }
    }

    public static void a(SharedPreferences sharedPreferences, rvs... rvsArr) {
        Editor edit = sharedPreferences.edit();
        for (rvs rvs : rvsArr) {
            if (rvs != null) {
                for (String remove : rvs.c) {
                    edit.remove(remove);
                }
                for (rvz rvz : rvs.b) {
                    int i = rvz.g;
                    String str;
                    if (i == 1) {
                        str = rvz.a;
                        if (i == 1) {
                            edit.putLong(str, rvz.b);
                        } else {
                            throw new IllegalArgumentException("Not a long type");
                        }
                    } else if (i == 2) {
                        str = rvz.a;
                        if (i == 2) {
                            edit.putBoolean(str, rvz.c);
                        } else {
                            throw new IllegalArgumentException("Not a boolean type");
                        }
                    } else if (i == 3) {
                        str = rvz.a;
                        if (i == 3) {
                            edit.putFloat(str, (float) rvz.d);
                        } else {
                            throw new IllegalArgumentException("Not a double type");
                        }
                    } else if (i == 4) {
                        String str2 = rvz.a;
                        if (i == 4) {
                            edit.putString(str2, rvz.e);
                        } else {
                            throw new IllegalArgumentException("Not a String type");
                        }
                    } else if (i != 5) {
                        continue;
                    } else if (i == 5) {
                        edit.putString(rvz.a, Base64.encodeToString(rvz.f, 3));
                    } else {
                        throw new IllegalArgumentException("Not a bytes type");
                    }
                }
                continue;
            }
        }
        if (!edit.commit()) {
            Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        }
    }
}
