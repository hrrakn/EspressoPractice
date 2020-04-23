package com.google.samples.apps.sunflower.databinding;
import com.google.samples.apps.sunflower.R;
import com.google.samples.apps.sunflower.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemGardenPlantingBindingImpl extends ListItemGardenPlantingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemGardenPlantingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemGardenPlantingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.imageView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.plantDate.setTag(null);
        this.waterDate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.sunflower.viewmodels.PlantAndGardenPlantingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.google.samples.apps.sunflower.viewmodels.PlantAndGardenPlantingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelImageUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelWateringInterval((androidx.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeViewModelWaterDateString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelPlantDateString((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPlantName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelImageUrl(androidx.databinding.ObservableField<java.lang.String> ViewModelImageUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWateringInterval(androidx.databinding.ObservableInt ViewModelWateringInterval, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaterDateString(androidx.databinding.ObservableField<java.lang.String> ViewModelWaterDateString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPlantDateString(androidx.databinding.ObservableField<java.lang.String> ViewModelPlantDateString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPlantName(androidx.databinding.ObservableField<java.lang.String> ViewModelPlantName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> viewModelImageUrl = null;
        java.lang.String waterDateAndroidPluralsWateringNextSuffixViewModelWateringIntervalViewModelWateringInterval = null;
        java.lang.String viewModelPlantDateStringGet = null;
        androidx.databinding.ObservableInt viewModelWateringInterval = null;
        java.lang.String viewModelWaterDateStringGet = null;
        java.lang.String viewModelPlantNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelWaterDateString = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String waterDateAndroidStringWateringNextPrefixViewModelWaterDateString = null;
        java.lang.String viewModelImageUrlGet = null;
        com.google.samples.apps.sunflower.viewmodels.PlantAndGardenPlantingsViewModel viewModel = mViewModel;
        java.lang.String waterDateAndroidStringWaterDateWaterDateAndroidStringWateringNextPrefixViewModelWaterDateStringWaterDateAndroidPluralsWateringNextSuffixViewModelWateringIntervalViewModelWateringInterval = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelPlantDateString = null;
        int viewModelWateringIntervalGet = 0;
        androidx.databinding.ObservableField<java.lang.String> viewModelPlantName = null;
        java.lang.String plantDateAndroidStringPlantedDateViewModelPlantNameViewModelPlantDateString = null;

        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xdfL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.imageUrl
                        viewModelImageUrl = viewModel.getImageUrl();
                    }
                    updateRegistration(0, viewModelImageUrl);


                    if (viewModelImageUrl != null) {
                        // read viewModel.imageUrl.get()
                        viewModelImageUrlGet = viewModelImageUrl.get();
                    }
            }
            if ((dirtyFlags & 0xc6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.wateringInterval
                        viewModelWateringInterval = viewModel.getWateringInterval();
                        // read viewModel.waterDateString
                        viewModelWaterDateString = viewModel.getWaterDateString();
                    }
                    updateRegistration(1, viewModelWateringInterval);
                    updateRegistration(2, viewModelWaterDateString);


                    if (viewModelWateringInterval != null) {
                        // read viewModel.wateringInterval.get()
                        viewModelWateringIntervalGet = viewModelWateringInterval.get();
                    }
                    if (viewModelWaterDateString != null) {
                        // read viewModel.waterDateString.get()
                        viewModelWaterDateStringGet = viewModelWaterDateString.get();
                    }


                    // read @android:plurals/watering_next_suffix
                    waterDateAndroidPluralsWateringNextSuffixViewModelWateringIntervalViewModelWateringInterval = waterDate.getResources().getQuantityString(R.plurals.watering_next_suffix, viewModelWateringIntervalGet, viewModelWateringIntervalGet);
                    // read @android:plurals/watering_next_suffix
                    waterDateAndroidPluralsWateringNextSuffixViewModelWateringIntervalViewModelWateringInterval = waterDate.getResources().getQuantityString(R.plurals.watering_next_suffix, viewModelWateringIntervalGet, viewModelWateringIntervalGet);
                    // read @android:string/watering_next_prefix
                    waterDateAndroidStringWateringNextPrefixViewModelWaterDateString = waterDate.getResources().getString(R.string.watering_next_prefix, viewModelWaterDateStringGet);


                    // read @android:string/water_date
                    waterDateAndroidStringWaterDateWaterDateAndroidStringWateringNextPrefixViewModelWaterDateStringWaterDateAndroidPluralsWateringNextSuffixViewModelWateringIntervalViewModelWateringInterval = waterDate.getResources().getString(R.string.water_date, waterDateAndroidStringWateringNextPrefixViewModelWaterDateString, waterDateAndroidPluralsWateringNextSuffixViewModelWateringIntervalViewModelWateringInterval);
            }
            if ((dirtyFlags & 0xd8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.plantDateString
                        viewModelPlantDateString = viewModel.getPlantDateString();
                        // read viewModel.plantName
                        viewModelPlantName = viewModel.getPlantName();
                    }
                    updateRegistration(3, viewModelPlantDateString);
                    updateRegistration(4, viewModelPlantName);


                    if (viewModelPlantDateString != null) {
                        // read viewModel.plantDateString.get()
                        viewModelPlantDateStringGet = viewModelPlantDateString.get();
                    }
                    if (viewModelPlantName != null) {
                        // read viewModel.plantName.get()
                        viewModelPlantNameGet = viewModelPlantName.get();
                    }


                    // read @android:string/planted_date
                    plantDateAndroidStringPlantedDateViewModelPlantNameViewModelPlantDateString = plantDate.getResources().getString(R.string.planted_date, viewModelPlantNameGet, viewModelPlantDateStringGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            com.google.samples.apps.sunflower.adapters.PlantDetailBindingAdaptersKt.bindImageFromUrl(this.imageView, viewModelImageUrlGet);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0xd8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.plantDate, plantDateAndroidStringPlantedDateViewModelPlantNameViewModelPlantDateString);
        }
        if ((dirtyFlags & 0xc6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.waterDate, waterDateAndroidStringWaterDateWaterDateAndroidStringWateringNextPrefixViewModelWaterDateStringWaterDateAndroidPluralsWateringNextSuffixViewModelWateringIntervalViewModelWateringInterval);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.imageUrl
        flag 1 (0x2L): viewModel.wateringInterval
        flag 2 (0x3L): viewModel.waterDateString
        flag 3 (0x4L): viewModel.plantDateString
        flag 4 (0x5L): viewModel.plantName
        flag 5 (0x6L): clickListener
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}