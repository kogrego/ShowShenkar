/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-27 16:00:31 UTC)
 * on 2016-06-15 at 15:48:13 UTC 
 * Modify at your own risk.
 */

package il.ac.shenkar.showshenkar.backend.projectApi;

/**
 * Service definition for ProjectApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ProjectApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class ProjectApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.22.0 of the projectApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://showshenkar.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "projectApi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public ProjectApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  ProjectApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "deleteProject".
   *
   * This request holds the parameters needed by the projectApi server.  After setting any optional
   * parameters, call the {@link DeleteProject#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public DeleteProject deleteProject(java.lang.String id) throws java.io.IOException {
    DeleteProject result = new DeleteProject(id);
    initialize(result);
    return result;
  }

  public class DeleteProject extends ProjectApiRequest<il.ac.shenkar.showshenkar.backend.projectApi.model.Project> {

    private static final String REST_PATH = "projectApi/{id}";

    /**
     * Create a request for the method "deleteProject".
     *
     * This request holds the parameters needed by the the projectApi server.  After setting any
     * optional parameters, call the {@link DeleteProject#execute()} method to invoke the remote
     * operation. <p> {@link DeleteProject#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected DeleteProject(java.lang.String id) {
      super(ProjectApi.this, "DELETE", REST_PATH, null, il.ac.shenkar.showshenkar.backend.projectApi.model.Project.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public DeleteProject setAlt(java.lang.String alt) {
      return (DeleteProject) super.setAlt(alt);
    }

    @Override
    public DeleteProject setFields(java.lang.String fields) {
      return (DeleteProject) super.setFields(fields);
    }

    @Override
    public DeleteProject setKey(java.lang.String key) {
      return (DeleteProject) super.setKey(key);
    }

    @Override
    public DeleteProject setOauthToken(java.lang.String oauthToken) {
      return (DeleteProject) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteProject setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteProject) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteProject setQuotaUser(java.lang.String quotaUser) {
      return (DeleteProject) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteProject setUserIp(java.lang.String userIp) {
      return (DeleteProject) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public DeleteProject setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public DeleteProject set(String parameterName, Object value) {
      return (DeleteProject) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getProject".
   *
   * This request holds the parameters needed by the projectApi server.  After setting any optional
   * parameters, call the {@link GetProject#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetProject getProject(java.lang.Long id) throws java.io.IOException {
    GetProject result = new GetProject(id);
    initialize(result);
    return result;
  }

  public class GetProject extends ProjectApiRequest<il.ac.shenkar.showshenkar.backend.projectApi.model.Project> {

    private static final String REST_PATH = "projectApi/{id}";

    /**
     * Create a request for the method "getProject".
     *
     * This request holds the parameters needed by the the projectApi server.  After setting any
     * optional parameters, call the {@link GetProject#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetProject#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetProject(java.lang.Long id) {
      super(ProjectApi.this, "GET", REST_PATH, null, il.ac.shenkar.showshenkar.backend.projectApi.model.Project.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetProject setAlt(java.lang.String alt) {
      return (GetProject) super.setAlt(alt);
    }

    @Override
    public GetProject setFields(java.lang.String fields) {
      return (GetProject) super.setFields(fields);
    }

    @Override
    public GetProject setKey(java.lang.String key) {
      return (GetProject) super.setKey(key);
    }

    @Override
    public GetProject setOauthToken(java.lang.String oauthToken) {
      return (GetProject) super.setOauthToken(oauthToken);
    }

    @Override
    public GetProject setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetProject) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetProject setQuotaUser(java.lang.String quotaUser) {
      return (GetProject) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetProject setUserIp(java.lang.String userIp) {
      return (GetProject) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetProject setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetProject set(String parameterName, Object value) {
      return (GetProject) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getProjects".
   *
   * This request holds the parameters needed by the projectApi server.  After setting any optional
   * parameters, call the {@link GetProjects#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetProjects getProjects() throws java.io.IOException {
    GetProjects result = new GetProjects();
    initialize(result);
    return result;
  }

  public class GetProjects extends ProjectApiRequest<il.ac.shenkar.showshenkar.backend.projectApi.model.ProjectCollection> {

    private static final String REST_PATH = "projectApi";

    /**
     * Create a request for the method "getProjects".
     *
     * This request holds the parameters needed by the the projectApi server.  After setting any
     * optional parameters, call the {@link GetProjects#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetProjects#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetProjects() {
      super(ProjectApi.this, "GET", REST_PATH, null, il.ac.shenkar.showshenkar.backend.projectApi.model.ProjectCollection.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetProjects setAlt(java.lang.String alt) {
      return (GetProjects) super.setAlt(alt);
    }

    @Override
    public GetProjects setFields(java.lang.String fields) {
      return (GetProjects) super.setFields(fields);
    }

    @Override
    public GetProjects setKey(java.lang.String key) {
      return (GetProjects) super.setKey(key);
    }

    @Override
    public GetProjects setOauthToken(java.lang.String oauthToken) {
      return (GetProjects) super.setOauthToken(oauthToken);
    }

    @Override
    public GetProjects setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetProjects) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetProjects setQuotaUser(java.lang.String quotaUser) {
      return (GetProjects) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetProjects setUserIp(java.lang.String userIp) {
      return (GetProjects) super.setUserIp(userIp);
    }

    @Override
    public GetProjects set(String parameterName, Object value) {
      return (GetProjects) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getProjectsByDepartment".
   *
   * This request holds the parameters needed by the projectApi server.  After setting any optional
   * parameters, call the {@link GetProjectsByDepartment#execute()} method to invoke the remote
   * operation.
   *
   * @param department
   * @return the request
   */
  public GetProjectsByDepartment getProjectsByDepartment(java.lang.String department) throws java.io.IOException {
    GetProjectsByDepartment result = new GetProjectsByDepartment(department);
    initialize(result);
    return result;
  }

  public class GetProjectsByDepartment extends ProjectApiRequest<il.ac.shenkar.showshenkar.backend.projectApi.model.ProjectCollection> {

    private static final String REST_PATH = "projectApi/ByDepartment/{department}";

    /**
     * Create a request for the method "getProjectsByDepartment".
     *
     * This request holds the parameters needed by the the projectApi server.  After setting any
     * optional parameters, call the {@link GetProjectsByDepartment#execute()} method to invoke the
     * remote operation. <p> {@link GetProjectsByDepartment#initialize(com.google.api.client.googleapi
     * s.services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @param department
     * @since 1.13
     */
    protected GetProjectsByDepartment(java.lang.String department) {
      super(ProjectApi.this, "GET", REST_PATH, null, il.ac.shenkar.showshenkar.backend.projectApi.model.ProjectCollection.class);
      this.department = com.google.api.client.util.Preconditions.checkNotNull(department, "Required parameter department must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetProjectsByDepartment setAlt(java.lang.String alt) {
      return (GetProjectsByDepartment) super.setAlt(alt);
    }

    @Override
    public GetProjectsByDepartment setFields(java.lang.String fields) {
      return (GetProjectsByDepartment) super.setFields(fields);
    }

    @Override
    public GetProjectsByDepartment setKey(java.lang.String key) {
      return (GetProjectsByDepartment) super.setKey(key);
    }

    @Override
    public GetProjectsByDepartment setOauthToken(java.lang.String oauthToken) {
      return (GetProjectsByDepartment) super.setOauthToken(oauthToken);
    }

    @Override
    public GetProjectsByDepartment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetProjectsByDepartment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetProjectsByDepartment setQuotaUser(java.lang.String quotaUser) {
      return (GetProjectsByDepartment) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetProjectsByDepartment setUserIp(java.lang.String userIp) {
      return (GetProjectsByDepartment) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String department;

    /**

     */
    public java.lang.String getDepartment() {
      return department;
    }

    public GetProjectsByDepartment setDepartment(java.lang.String department) {
      this.department = department;
      return this;
    }

    @Override
    public GetProjectsByDepartment set(String parameterName, Object value) {
      return (GetProjectsByDepartment) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "setProject".
   *
   * This request holds the parameters needed by the projectApi server.  After setting any optional
   * parameters, call the {@link SetProject#execute()} method to invoke the remote operation.
   *
   * @param content the {@link il.ac.shenkar.showshenkar.backend.projectApi.model.Project}
   * @return the request
   */
  public SetProject setProject(il.ac.shenkar.showshenkar.backend.projectApi.model.Project content) throws java.io.IOException {
    SetProject result = new SetProject(content);
    initialize(result);
    return result;
  }

  public class SetProject extends ProjectApiRequest<il.ac.shenkar.showshenkar.backend.projectApi.model.Project> {

    private static final String REST_PATH = "projectApi";

    /**
     * Create a request for the method "setProject".
     *
     * This request holds the parameters needed by the the projectApi server.  After setting any
     * optional parameters, call the {@link SetProject#execute()} method to invoke the remote
     * operation. <p> {@link
     * SetProject#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link il.ac.shenkar.showshenkar.backend.projectApi.model.Project}
     * @since 1.13
     */
    protected SetProject(il.ac.shenkar.showshenkar.backend.projectApi.model.Project content) {
      super(ProjectApi.this, "POST", REST_PATH, content, il.ac.shenkar.showshenkar.backend.projectApi.model.Project.class);
    }

    @Override
    public SetProject setAlt(java.lang.String alt) {
      return (SetProject) super.setAlt(alt);
    }

    @Override
    public SetProject setFields(java.lang.String fields) {
      return (SetProject) super.setFields(fields);
    }

    @Override
    public SetProject setKey(java.lang.String key) {
      return (SetProject) super.setKey(key);
    }

    @Override
    public SetProject setOauthToken(java.lang.String oauthToken) {
      return (SetProject) super.setOauthToken(oauthToken);
    }

    @Override
    public SetProject setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SetProject) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SetProject setQuotaUser(java.lang.String quotaUser) {
      return (SetProject) super.setQuotaUser(quotaUser);
    }

    @Override
    public SetProject setUserIp(java.lang.String userIp) {
      return (SetProject) super.setUserIp(userIp);
    }

    @Override
    public SetProject set(String parameterName, Object value) {
      return (SetProject) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link ProjectApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link ProjectApi}. */
    @Override
    public ProjectApi build() {
      return new ProjectApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ProjectApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setProjectApiRequestInitializer(
        ProjectApiRequestInitializer projectapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(projectapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
