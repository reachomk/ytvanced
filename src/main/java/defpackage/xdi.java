package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import java.util.List;

/* renamed from: xdi */
class xdi extends PackageManager {
    public final PackageManager a;

    protected xdi(PackageManager packageManager) {
        this.a = packageManager;
    }

    public void addPackageToPreferred(String str) {
        this.a.addPackageToPreferred(str);
    }

    public boolean addPermission(PermissionInfo permissionInfo) {
        return this.a.addPermission(permissionInfo);
    }

    public boolean addPermissionAsync(PermissionInfo permissionInfo) {
        return this.a.addPermissionAsync(permissionInfo);
    }

    public void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        this.a.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
    }

    public boolean canRequestPackageInstalls() {
        return this.a.canRequestPackageInstalls();
    }

    public String[] canonicalToCurrentPackageNames(String[] strArr) {
        return this.a.canonicalToCurrentPackageNames(strArr);
    }

    public int checkPermission(String str, String str2) {
        return this.a.checkPermission(str, str2);
    }

    public int checkSignatures(String str, String str2) {
        return this.a.checkSignatures(str, str2);
    }

    public int checkSignatures(int i, int i2) {
        return this.a.checkSignatures(i, i2);
    }

    public void clearInstantAppCookie() {
        this.a.clearInstantAppCookie();
    }

    public void clearPackagePreferredActivities(String str) {
        this.a.clearPackagePreferredActivities(str);
    }

    public String[] currentToCanonicalPackageNames(String[] strArr) {
        return this.a.currentToCanonicalPackageNames(strArr);
    }

    public void extendVerificationTimeout(int i, int i2, long j) {
        this.a.extendVerificationTimeout(i, i2, j);
    }

    public Drawable getActivityBanner(ComponentName componentName) {
        return this.a.getActivityBanner(componentName);
    }

    public Drawable getActivityBanner(Intent intent) {
        return this.a.getActivityBanner(intent);
    }

    public Drawable getActivityIcon(ComponentName componentName) {
        return this.a.getActivityIcon(componentName);
    }

    public Drawable getActivityIcon(Intent intent) {
        return this.a.getActivityIcon(intent);
    }

    public ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        return this.a.getActivityInfo(componentName, i);
    }

    public Drawable getActivityLogo(ComponentName componentName) {
        return this.a.getActivityLogo(componentName);
    }

    public Drawable getActivityLogo(Intent intent) {
        return this.a.getActivityLogo(intent);
    }

    public List getAllPermissionGroups(int i) {
        return this.a.getAllPermissionGroups(i);
    }

    public Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        return this.a.getApplicationBanner(applicationInfo);
    }

    public Drawable getApplicationBanner(String str) {
        return this.a.getApplicationBanner(str);
    }

    public int getApplicationEnabledSetting(String str) {
        return this.a.getApplicationEnabledSetting(str);
    }

    public Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        return this.a.getApplicationIcon(applicationInfo);
    }

    public Drawable getApplicationIcon(String str) {
        return this.a.getApplicationIcon(str);
    }

    public ApplicationInfo getApplicationInfo(String str, int i) {
        return this.a.getApplicationInfo(str, i);
    }

    public CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        return this.a.getApplicationLabel(applicationInfo);
    }

    public Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
        return this.a.getApplicationLogo(applicationInfo);
    }

    public Drawable getApplicationLogo(String str) {
        return this.a.getApplicationLogo(str);
    }

    public ChangedPackages getChangedPackages(int i) {
        return this.a.getChangedPackages(i);
    }

    public int getComponentEnabledSetting(ComponentName componentName) {
        return this.a.getComponentEnabledSetting(componentName);
    }

    public Drawable getDefaultActivityIcon() {
        return this.a.getDefaultActivityIcon();
    }

    public Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getDrawable(str, i, applicationInfo);
    }

    public List getInstalledApplications(int i) {
        return this.a.getInstalledApplications(i);
    }

    public List getInstalledPackages(int i) {
        return this.a.getInstalledPackages(i);
    }

    public String getInstallerPackageName(String str) {
        return this.a.getInstallerPackageName(str);
    }

    public byte[] getInstantAppCookie() {
        return this.a.getInstantAppCookie();
    }

    public int getInstantAppCookieMaxBytes() {
        return this.a.getInstantAppCookieMaxBytes();
    }

    public InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) {
        return this.a.getInstrumentationInfo(componentName, i);
    }

    public Intent getLaunchIntentForPackage(String str) {
        return this.a.getLaunchIntentForPackage(str);
    }

    public Intent getLeanbackLaunchIntentForPackage(String str) {
        return this.a.getLeanbackLaunchIntentForPackage(str);
    }

    public String getNameForUid(int i) {
        return this.a.getNameForUid(i);
    }

    public int[] getPackageGids(String str) {
        return this.a.getPackageGids(str);
    }

    public int[] getPackageGids(String str, int i) {
        return this.a.getPackageGids(str, i);
    }

    public PackageInfo getPackageInfo(String str, int i) {
        return this.a.getPackageInfo(str, i);
    }

    public PackageInfo getPackageInfo(VersionedPackage versionedPackage, int i) {
        return this.a.getPackageInfo(versionedPackage, i);
    }

    public PackageInstaller getPackageInstaller() {
        return this.a.getPackageInstaller();
    }

    public int getPackageUid(String str, int i) {
        return this.a.getPackageUid(str, i);
    }

    public String[] getPackagesForUid(int i) {
        return this.a.getPackagesForUid(i);
    }

    public List getPackagesHoldingPermissions(String[] strArr, int i) {
        return this.a.getPackagesHoldingPermissions(strArr, i);
    }

    public PermissionGroupInfo getPermissionGroupInfo(String str, int i) {
        return this.a.getPermissionGroupInfo(str, i);
    }

    public PermissionInfo getPermissionInfo(String str, int i) {
        return this.a.getPermissionInfo(str, i);
    }

    public int getPreferredActivities(List list, List list2, String str) {
        return this.a.getPreferredActivities(list, list2, str);
    }

    public List getPreferredPackages(int i) {
        return this.a.getPreferredPackages(i);
    }

    public ProviderInfo getProviderInfo(ComponentName componentName, int i) {
        return this.a.getProviderInfo(componentName, i);
    }

    public ActivityInfo getReceiverInfo(ComponentName componentName, int i) {
        return this.a.getReceiverInfo(componentName, i);
    }

    public Resources getResourcesForActivity(ComponentName componentName) {
        return this.a.getResourcesForActivity(componentName);
    }

    public Resources getResourcesForApplication(ApplicationInfo applicationInfo) {
        return this.a.getResourcesForApplication(applicationInfo);
    }

    public Resources getResourcesForApplication(String str) {
        return this.a.getResourcesForApplication(str);
    }

    public ServiceInfo getServiceInfo(ComponentName componentName, int i) {
        return this.a.getServiceInfo(componentName, i);
    }

    public List getSharedLibraries(int i) {
        return this.a.getSharedLibraries(i);
    }

    public FeatureInfo[] getSystemAvailableFeatures() {
        return this.a.getSystemAvailableFeatures();
    }

    public String[] getSystemSharedLibraryNames() {
        return this.a.getSystemSharedLibraryNames();
    }

    public CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getText(str, i, applicationInfo);
    }

    public Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        return this.a.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
    }

    public Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        return this.a.getUserBadgedIcon(drawable, userHandle);
    }

    public CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        return this.a.getUserBadgedLabel(charSequence, userHandle);
    }

    public XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        return this.a.getXml(str, i, applicationInfo);
    }

    public boolean hasSystemFeature(String str) {
        return this.a.hasSystemFeature(str);
    }

    public boolean hasSystemFeature(String str, int i) {
        return this.a.hasSystemFeature(str, i);
    }

    public boolean isInstantApp() {
        return this.a.isInstantApp();
    }

    public boolean isInstantApp(String str) {
        return this.a.isInstantApp(str);
    }

    public boolean isPermissionRevokedByPolicy(String str, String str2) {
        return this.a.isPermissionRevokedByPolicy(str, str2);
    }

    public boolean isSafeMode() {
        return this.a.isSafeMode();
    }

    public List queryBroadcastReceivers(Intent intent, int i) {
        return this.a.queryBroadcastReceivers(intent, i);
    }

    public List queryContentProviders(String str, int i, int i2) {
        return this.a.queryContentProviders(str, i, i2);
    }

    public List queryInstrumentation(String str, int i) {
        return this.a.queryInstrumentation(str, i);
    }

    public List queryIntentActivities(Intent intent, int i) {
        return this.a.queryIntentActivities(intent, i);
    }

    public List queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        return this.a.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }

    public List queryIntentContentProviders(Intent intent, int i) {
        return this.a.queryIntentContentProviders(intent, i);
    }

    public List queryIntentServices(Intent intent, int i) {
        return this.a.queryIntentServices(intent, i);
    }

    public List queryPermissionsByGroup(String str, int i) {
        return this.a.queryPermissionsByGroup(str, i);
    }

    public void removePackageFromPreferred(String str) {
        this.a.removePackageFromPreferred(str);
    }

    public void removePermission(String str) {
        this.a.removePermission(str);
    }

    public ResolveInfo resolveActivity(Intent intent, int i) {
        return this.a.resolveActivity(intent, i);
    }

    public ProviderInfo resolveContentProvider(String str, int i) {
        return this.a.resolveContentProvider(str, i);
    }

    public ResolveInfo resolveService(Intent intent, int i) {
        return this.a.resolveService(intent, i);
    }

    public void setApplicationCategoryHint(String str, int i) {
        this.a.setApplicationCategoryHint(str, i);
    }

    public void setApplicationEnabledSetting(String str, int i, int i2) {
        this.a.setApplicationEnabledSetting(str, i, i2);
    }

    public void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        this.a.setComponentEnabledSetting(componentName, i, i2);
    }

    public void setInstallerPackageName(String str, String str2) {
        this.a.setInstallerPackageName(str, str2);
    }

    public void updateInstantAppCookie(byte[] bArr) {
        this.a.updateInstantAppCookie(bArr);
    }

    public void verifyPendingInstall(int i, int i2) {
        this.a.verifyPendingInstall(i, i2);
    }
}
