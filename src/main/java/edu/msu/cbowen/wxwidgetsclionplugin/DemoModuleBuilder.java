package edu.msu.cbowen.wxwidgetsclionplugin;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DemoModuleBuilder extends ModuleBuilder {
    private static final Logger LOG = Logger.getInstance(DemoModuleBuilder.class);

//        protected DemoModuleBuilder() {
//            addModuleConfigurationUpdater(new ModuleConfigurationUpdater() {
//                @Override
//                public void update(@NotNull Module module, @NotNull ModifiableRootModel rootModel) {
//                    String basePath = module.getProject().getBasePath();
//                    LOG.assertTrue(basePath != null);
//                    VirtualFile file = LocalFileSystem.getInstance().findFileByPath(basePath);
//                    LOG.assertTrue(file != null);
//                    rootModel.addContentEntry(file);
//                }
//            });
//        }

    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{new ModuleWizardStep() {
            @Override
            public JComponent getComponent() {
                return new JLabel("Put your content here");
            }

            @Override
            public void updateDataModel() {

            }
        }};
    }

    @Override
    public ModuleType<?> getModuleType() {
        return new DemoModuleType();
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}