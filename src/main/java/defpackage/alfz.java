package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* renamed from: alfz */
public final class alfz extends AsyncTask {
    private static final String[] a = new String[]{"contact_id", "display_name", "data2", "data1", "data3"};
    private final WeakReference b;
    private final WeakReference c;
    private final allc d;
    private final alei e;
    private final alfy f;

    public alfz(Context context, allc allc, alga alga, alei alei, alfy alfy) {
        this.b = new WeakReference(context);
        this.c = new WeakReference(alga);
        this.d = (allc) amqw.a((Object) allc);
        this.e = alei;
        this.f = (alfy) amqw.a((Object) alfy);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        if (this.c.get() != null) {
            alga alga = (alga) this.c.get();
            allc allc = this.d;
            String[] strArr = new String[allc.b.size()];
            int i = 0;
            for (alld alld : allc.b) {
                int i2 = i + 1;
                strArr[i] = alld.b;
                i = i2;
            }
            alga.a(strArr, this.e);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        allc allc = this.d;
        allc.a.clear();
        allc.b.clear();
        Context context = (Context) this.b.get();
        if (context != null) {
            Cursor query = this.f.a(context).query(Phone.CONTENT_URI, a, "has_phone_number > 0 ", null, "display_name ASC");
            if (query != null) {
                int columnIndex = query.getColumnIndex("contact_id");
                int columnIndex2 = query.getColumnIndex("display_name");
                int columnIndex3 = query.getColumnIndex("data2");
                int columnIndex4 = query.getColumnIndex("data1");
                int columnIndex5 = query.getColumnIndex("data3");
                Resources resources = context.getResources();
                while (query.moveToNext() && !isCancelled()) {
                    try {
                        long j = query.getLong(columnIndex);
                        String string = query.getString(columnIndex2);
                        int i = query.getInt(columnIndex3);
                        String string2 = query.getString(columnIndex4);
                        CharSequence typeLabel = Phone.getTypeLabel(resources, i, query.getString(columnIndex5));
                        Uri withAppendedPath = Uri.withAppendedPath(ContentUris.withAppendedId(Contacts.CONTENT_URI, j), "photo");
                        if (!TextUtils.isEmpty(string2)) {
                            Resources resources2 = resources;
                            allc = this.d;
                            alld alld = new alld(j, string2, string, typeLabel.toString(), withAppendedPath);
                            alld = r18;
                            if (allc.a.add(alld)) {
                                allc.b.add(alld);
                            }
                            resources = resources2;
                        }
                    } catch (Throwable th) {
                        query.close();
                    }
                }
                query.close();
            }
        }
        return null;
    }
}
