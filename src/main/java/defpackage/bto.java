package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.InputStream;

/* renamed from: bto */
public final class bto extends btm {
    private static final UriMatcher a;

    public bto(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public final Class d() {
        return InputStream.class;
    }

    private static InputStream a(ContentResolver contentResolver, Uri uri) {
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((InputStream) obj).close();
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        a = uriMatcher;
        String str = "com.android.contacts";
        uriMatcher.addURI(str, "contacts/lookup/*/#", 1);
        a.addURI(str, "contacts/lookup/*", 1);
        a.addURI(str, "contacts/#/photo", 2);
        a.addURI(str, "contacts/#", 3);
        a.addURI(str, "contacts/#/display_photo", 4);
        a.addURI(str, "phone_lookup/*", 5);
    }
}
