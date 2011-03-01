
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.PersonPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author mrb
 * 
 */
public class PersonPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PersonPropertiesEditionPart {

	protected Text firstName;
	protected Text middleName;
	protected Text lastName;
	protected Text nickName;
	protected Text organization;
	protected Text department;
	protected Text email;
	protected Text description;
	protected Text id;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PersonPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(AmlMessages.PersonPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createFirstNameText(propertiesGroup);
		createMiddleNameText(propertiesGroup);
		createLastNameText(propertiesGroup);
		createNickNameText(propertiesGroup);
		createOrganizationText(propertiesGroup);
		createDepartmentText(propertiesGroup);
		createEmailText(propertiesGroup);
		createDescriptionTextarea(propertiesGroup);
		createIdText(propertiesGroup);
	}

	
	protected void createFirstNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_FirstNameLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.firstName, AmlViewsRepository.SWT_KIND));
		firstName = new Text(parent, SWT.BORDER);
		GridData firstNameData = new GridData(GridData.FILL_HORIZONTAL);
		firstName.setLayoutData(firstNameData);
		firstName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.firstName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, firstName.getText()));
			}

		});
		firstName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.firstName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, firstName.getText()));
				}
			}

		});
		EditingUtils.setID(firstName, AmlViewsRepository.Person.firstName);
		EditingUtils.setEEFtype(firstName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.firstName, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createMiddleNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_MiddleNameLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.middleName, AmlViewsRepository.SWT_KIND));
		middleName = new Text(parent, SWT.BORDER);
		GridData middleNameData = new GridData(GridData.FILL_HORIZONTAL);
		middleName.setLayoutData(middleNameData);
		middleName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.middleName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, middleName.getText()));
			}

		});
		middleName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.middleName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, middleName.getText()));
				}
			}

		});
		EditingUtils.setID(middleName, AmlViewsRepository.Person.middleName);
		EditingUtils.setEEFtype(middleName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.middleName, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createLastNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_LastNameLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.lastName, AmlViewsRepository.SWT_KIND));
		lastName = new Text(parent, SWT.BORDER);
		GridData lastNameData = new GridData(GridData.FILL_HORIZONTAL);
		lastName.setLayoutData(lastNameData);
		lastName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.lastName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastName.getText()));
			}

		});
		lastName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.lastName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, lastName.getText()));
				}
			}

		});
		EditingUtils.setID(lastName, AmlViewsRepository.Person.lastName);
		EditingUtils.setEEFtype(lastName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.lastName, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createNickNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_NickNameLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.nickName, AmlViewsRepository.SWT_KIND));
		nickName = new Text(parent, SWT.BORDER);
		GridData nickNameData = new GridData(GridData.FILL_HORIZONTAL);
		nickName.setLayoutData(nickNameData);
		nickName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.nickName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nickName.getText()));
			}

		});
		nickName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.nickName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nickName.getText()));
				}
			}

		});
		EditingUtils.setID(nickName, AmlViewsRepository.Person.nickName);
		EditingUtils.setEEFtype(nickName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.nickName, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createOrganizationText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_OrganizationLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.organization, AmlViewsRepository.SWT_KIND));
		organization = new Text(parent, SWT.BORDER);
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
			}

		});
		organization.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
				}
			}

		});
		EditingUtils.setID(organization, AmlViewsRepository.Person.organization);
		EditingUtils.setEEFtype(organization, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.organization, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDepartmentText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_DepartmentLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.department, AmlViewsRepository.SWT_KIND));
		department = new Text(parent, SWT.BORDER);
		GridData departmentData = new GridData(GridData.FILL_HORIZONTAL);
		department.setLayoutData(departmentData);
		department.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.department, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, department.getText()));
			}

		});
		department.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.department, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, department.getText()));
				}
			}

		});
		EditingUtils.setID(department, AmlViewsRepository.Person.department);
		EditingUtils.setEEFtype(department, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.department, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createEmailText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_EmailLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.email, AmlViewsRepository.SWT_KIND));
		email = new Text(parent, SWT.BORDER);
		GridData emailData = new GridData(GridData.FILL_HORIZONTAL);
		email.setLayoutData(emailData);
		email.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.email, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, email.getText()));
			}

		});
		email.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.email, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, email.getText()));
				}
			}

		});
		EditingUtils.setID(email, AmlViewsRepository.Person.email);
		EditingUtils.setEEFtype(email, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.email, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionTextarea(Composite parent) {
		Label descriptionLabel = SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.description, AmlViewsRepository.SWT_KIND));
		GridData descriptionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionLabelData.horizontalSpan = 3;
		descriptionLabel.setLayoutData(descriptionLabelData);
		description = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionData.horizontalSpan = 2;
		descriptionData.heightHint = 80;
		descriptionData.widthHint = 200;
		description.setLayoutData(descriptionData);
		EditingUtils.setID(description, AmlViewsRepository.Person.description);
		EditingUtils.setEEFtype(description, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.description, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createIdText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.PersonPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Person.id, AmlViewsRepository.SWT_KIND));
		id = new Text(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PersonPropertiesEditionPartImpl.this, AmlViewsRepository.Person.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, AmlViewsRepository.Person.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Person.id, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getFirstName()
	 * 
	 */
	public String getFirstName() {
		return firstName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setFirstName(String newValue)
	 * 
	 */
	public void setFirstName(String newValue) {
		if (newValue != null) {
			firstName.setText(newValue);
		} else {
			firstName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getMiddleName()
	 * 
	 */
	public String getMiddleName() {
		return middleName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setMiddleName(String newValue)
	 * 
	 */
	public void setMiddleName(String newValue) {
		if (newValue != null) {
			middleName.setText(newValue);
		} else {
			middleName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getLastName()
	 * 
	 */
	public String getLastName() {
		return lastName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setLastName(String newValue)
	 * 
	 */
	public void setLastName(String newValue) {
		if (newValue != null) {
			lastName.setText(newValue);
		} else {
			lastName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getNickName()
	 * 
	 */
	public String getNickName() {
		return nickName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setNickName(String newValue)
	 * 
	 */
	public void setNickName(String newValue) {
		if (newValue != null) {
			nickName.setText(newValue);
		} else {
			nickName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getOrganization()
	 * 
	 */
	public String getOrganization() {
		return organization.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setOrganization(String newValue)
	 * 
	 */
	public void setOrganization(String newValue) {
		if (newValue != null) {
			organization.setText(newValue);
		} else {
			organization.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getDepartment()
	 * 
	 */
	public String getDepartment() {
		return department.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setDepartment(String newValue)
	 * 
	 */
	public void setDepartment(String newValue) {
		if (newValue != null) {
			department.setText(newValue);
		} else {
			department.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getEmail()
	 * 
	 */
	public String getEmail() {
		return email.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setEmail(String newValue)
	 * 
	 */
	public void setEmail(String newValue) {
		if (newValue != null) {
			email.setText(newValue);
		} else {
			email.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.PersonPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Person_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
