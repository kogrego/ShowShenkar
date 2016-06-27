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
 * on 2016-06-27 at 13:19:46 UTC 
 * Modify at your own risk.
 */

package il.ac.shenkar.showshenkar.backend.departmentApi;

/**
 * Service definition for DepartmentApi (v1).
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
 * This service uses {@link DepartmentApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class DepartmentApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.22.0 of the departmentApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://shenkarshow.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "departmentApi/v1/";

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
  public DepartmentApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  DepartmentApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "deleteDepartment".
   *
   * This request holds the parameters needed by the departmentApi server.  After setting any optional
   * parameters, call the {@link DeleteDepartment#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public DeleteDepartment deleteDepartment(java.lang.Long id) throws java.io.IOException {
    DeleteDepartment result = new DeleteDepartment(id);
    initialize(result);
    return result;
  }

  public class DeleteDepartment extends DepartmentApiRequest<Void> {

    private static final String REST_PATH = "departmentApi/{id}";

    /**
     * Create a request for the method "deleteDepartment".
     *
     * This request holds the parameters needed by the the departmentApi server.  After setting any
     * optional parameters, call the {@link DeleteDepartment#execute()} method to invoke the remote
     * operation. <p> {@link DeleteDepartment#initialize(com.google.api.client.googleapis.services.Abs
     * tractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected DeleteDepartment(java.lang.Long id) {
      super(DepartmentApi.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public DeleteDepartment setAlt(java.lang.String alt) {
      return (DeleteDepartment) super.setAlt(alt);
    }

    @Override
    public DeleteDepartment setFields(java.lang.String fields) {
      return (DeleteDepartment) super.setFields(fields);
    }

    @Override
    public DeleteDepartment setKey(java.lang.String key) {
      return (DeleteDepartment) super.setKey(key);
    }

    @Override
    public DeleteDepartment setOauthToken(java.lang.String oauthToken) {
      return (DeleteDepartment) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteDepartment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteDepartment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteDepartment setQuotaUser(java.lang.String quotaUser) {
      return (DeleteDepartment) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteDepartment setUserIp(java.lang.String userIp) {
      return (DeleteDepartment) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public DeleteDepartment setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public DeleteDepartment set(String parameterName, Object value) {
      return (DeleteDepartment) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getDepartment".
   *
   * This request holds the parameters needed by the departmentApi server.  After setting any optional
   * parameters, call the {@link GetDepartment#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetDepartment getDepartment(java.lang.Long id) throws java.io.IOException {
    GetDepartment result = new GetDepartment(id);
    initialize(result);
    return result;
  }

  public class GetDepartment extends DepartmentApiRequest<il.ac.shenkar.showshenkar.backend.departmentApi.model.Department> {

    private static final String REST_PATH = "departmentApi/{id}";

    /**
     * Create a request for the method "getDepartment".
     *
     * This request holds the parameters needed by the the departmentApi server.  After setting any
     * optional parameters, call the {@link GetDepartment#execute()} method to invoke the remote
     * operation. <p> {@link GetDepartment#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetDepartment(java.lang.Long id) {
      super(DepartmentApi.this, "GET", REST_PATH, null, il.ac.shenkar.showshenkar.backend.departmentApi.model.Department.class);
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
    public GetDepartment setAlt(java.lang.String alt) {
      return (GetDepartment) super.setAlt(alt);
    }

    @Override
    public GetDepartment setFields(java.lang.String fields) {
      return (GetDepartment) super.setFields(fields);
    }

    @Override
    public GetDepartment setKey(java.lang.String key) {
      return (GetDepartment) super.setKey(key);
    }

    @Override
    public GetDepartment setOauthToken(java.lang.String oauthToken) {
      return (GetDepartment) super.setOauthToken(oauthToken);
    }

    @Override
    public GetDepartment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetDepartment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetDepartment setQuotaUser(java.lang.String quotaUser) {
      return (GetDepartment) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetDepartment setUserIp(java.lang.String userIp) {
      return (GetDepartment) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetDepartment setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetDepartment set(String parameterName, Object value) {
      return (GetDepartment) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getDepartments".
   *
   * This request holds the parameters needed by the departmentApi server.  After setting any optional
   * parameters, call the {@link GetDepartments#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetDepartments getDepartments() throws java.io.IOException {
    GetDepartments result = new GetDepartments();
    initialize(result);
    return result;
  }

  public class GetDepartments extends DepartmentApiRequest<il.ac.shenkar.showshenkar.backend.departmentApi.model.DepartmentCollection> {

    private static final String REST_PATH = "departmentApi";

    /**
     * Create a request for the method "getDepartments".
     *
     * This request holds the parameters needed by the the departmentApi server.  After setting any
     * optional parameters, call the {@link GetDepartments#execute()} method to invoke the remote
     * operation. <p> {@link GetDepartments#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected GetDepartments() {
      super(DepartmentApi.this, "GET", REST_PATH, null, il.ac.shenkar.showshenkar.backend.departmentApi.model.DepartmentCollection.class);
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
    public GetDepartments setAlt(java.lang.String alt) {
      return (GetDepartments) super.setAlt(alt);
    }

    @Override
    public GetDepartments setFields(java.lang.String fields) {
      return (GetDepartments) super.setFields(fields);
    }

    @Override
    public GetDepartments setKey(java.lang.String key) {
      return (GetDepartments) super.setKey(key);
    }

    @Override
    public GetDepartments setOauthToken(java.lang.String oauthToken) {
      return (GetDepartments) super.setOauthToken(oauthToken);
    }

    @Override
    public GetDepartments setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetDepartments) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetDepartments setQuotaUser(java.lang.String quotaUser) {
      return (GetDepartments) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetDepartments setUserIp(java.lang.String userIp) {
      return (GetDepartments) super.setUserIp(userIp);
    }

    @Override
    public GetDepartments set(String parameterName, Object value) {
      return (GetDepartments) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "setDepartment".
   *
   * This request holds the parameters needed by the departmentApi server.  After setting any optional
   * parameters, call the {@link SetDepartment#execute()} method to invoke the remote operation.
   *
   * @param content the {@link il.ac.shenkar.showshenkar.backend.departmentApi.model.Department}
   * @return the request
   */
  public SetDepartment setDepartment(il.ac.shenkar.showshenkar.backend.departmentApi.model.Department content) throws java.io.IOException {
    SetDepartment result = new SetDepartment(content);
    initialize(result);
    return result;
  }

  public class SetDepartment extends DepartmentApiRequest<il.ac.shenkar.showshenkar.backend.departmentApi.model.Department> {

    private static final String REST_PATH = "departmentApi";

    /**
     * Create a request for the method "setDepartment".
     *
     * This request holds the parameters needed by the the departmentApi server.  After setting any
     * optional parameters, call the {@link SetDepartment#execute()} method to invoke the remote
     * operation. <p> {@link SetDepartment#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link il.ac.shenkar.showshenkar.backend.departmentApi.model.Department}
     * @since 1.13
     */
    protected SetDepartment(il.ac.shenkar.showshenkar.backend.departmentApi.model.Department content) {
      super(DepartmentApi.this, "POST", REST_PATH, content, il.ac.shenkar.showshenkar.backend.departmentApi.model.Department.class);
    }

    @Override
    public SetDepartment setAlt(java.lang.String alt) {
      return (SetDepartment) super.setAlt(alt);
    }

    @Override
    public SetDepartment setFields(java.lang.String fields) {
      return (SetDepartment) super.setFields(fields);
    }

    @Override
    public SetDepartment setKey(java.lang.String key) {
      return (SetDepartment) super.setKey(key);
    }

    @Override
    public SetDepartment setOauthToken(java.lang.String oauthToken) {
      return (SetDepartment) super.setOauthToken(oauthToken);
    }

    @Override
    public SetDepartment setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SetDepartment) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SetDepartment setQuotaUser(java.lang.String quotaUser) {
      return (SetDepartment) super.setQuotaUser(quotaUser);
    }

    @Override
    public SetDepartment setUserIp(java.lang.String userIp) {
      return (SetDepartment) super.setUserIp(userIp);
    }

    @Override
    public SetDepartment set(String parameterName, Object value) {
      return (SetDepartment) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link DepartmentApi}.
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

    /** Builds a new instance of {@link DepartmentApi}. */
    @Override
    public DepartmentApi build() {
      return new DepartmentApi(this);
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
     * Set the {@link DepartmentApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setDepartmentApiRequestInitializer(
        DepartmentApiRequestInitializer departmentapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(departmentapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}